/*
Copyright 2016 The Kubernetes Authors.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package main

import (
	"github.com/rs/zerolog"
	sloglogrus "github.com/samber/slog-logrus/v2"
	slogzap "github.com/samber/slog-zap/v2"
	"github.com/samber/slog-zerolog"
	"github.com/sirupsen/logrus"
	"go.uber.org/zap"
	"go.uber.org/zap/exp/zapslog"

	"net"
	"net/http"

	"log/slog"
	"os"
)

func main() {
	//log.Printf("hello, world!")
	//log.Print("Info message")
	//slog.Info("Info message")

	handlerJson := slog.NewJSONHandler(os.Stdout, nil)
	logger := slog.NewLogLogger(handlerJson, slog.LevelDebug)
	logger.Printf("Info message %d", 12345) // doesn't work/show-up

	loggerJson := slog.New(slog.NewJSONHandler(os.Stdout, nil))
	slog.SetDefault(loggerJson)
	//loggerJson.Debug("Debug message")
	loggerJson.Info("Info message")
	//loggerJson.Warn("Warning message")
	//loggerJson.Error("Error message")

	loggerTxt := slog.New(slog.NewTextHandler(os.Stdout, nil))
	slog.SetDefault(loggerTxt)
	//loggerTxt.Debug("Debug message")
	loggerTxt.Info("Info message")
	//loggerTxt.Warn("Warning message")
	//loggerTxt.Error("Error message")
	//slog.Debug("Debug message")
	//slog.Info("Info message")
	slog.Warn("Warning message")
	//slog.Error("Error message")

	InitLog()

	InitLogZap()

	InitLogZapSamber()

	InitLogZerolog()

	InitLogLogrus()

}

func InitLog( /* out io.Writer, handler slog.Handler */ ) {

}

/**
 * Ref: https://betterstack.com/community/guides/logging/logging-in-go/
 */
func InitLogZap() {
	zapL := zap.Must(zap.NewProduction())

	defer zapL.Sync()

	logger := slog.New(zapslog.NewHandler(zapL.Core(), nil))

	//logger.Info(
	//	"incoming request",
	//	slog.String("method", "GET"),
	//	slog.String("path", "/api/user"),
	//	slog.Int("status", 200),
	//)

	logger.Error("something went wrong", net.ErrClosed,
		"status", http.StatusInternalServerError)

	//slog.Error("something went wrong", net.ErrClosed,
	//	"status", http.StatusInternalServerError)

	slog.SetDefault(logger)

	//slog.Debug("Debug message")
	//slog.Info("Info message")
	//slog.Warn("Warning message")
	//slog.Error("Error message")
	slog.Error("something went wrong", net.ErrClosed,
		"status", http.StatusInternalServerError)

	//log.Print("something went wrong")
	//log.Fatalln("something went wrong")

}

// https://github.com/samber/slog-zap/blob/main/example/example.go
func InitLogZapSamber() {
	zapLogger, _ := zap.NewProduction()

	logger := slog.New(slogzap.Option{Level: slog.LevelDebug, Logger: zapLogger}.NewZapHandler())
	//logger = logger.With("release", "v1.0.0")

	//logger.Info(
	//	"incoming request",
	//	slog.String("method", "GET"),
	//	slog.String("path", "/api/user"),
	//	slog.Int("status", 200),
	//)

	logger.Error("something went wrong", net.ErrClosed,
		"status", http.StatusInternalServerError)

	slog.SetDefault(logger)

	//slog.Debug("Debug message")
	//slog.Info("Info message")
	//slog.Warn("Warning message")
	//slog.Error("Error message")
	slog.Error("something went wrong", net.ErrClosed,
		"status", http.StatusInternalServerError)

	//log.Print("something went wrong")
	//log.Fatalln("something went wrong")
}

/**
 * Ref: https://betterstack.com/community/guides/logging/logging-in-go/
 */
func InitLogZerolog() {
	zerologL := zerolog.New(os.Stdout).Level(zerolog.InfoLevel)

	logger := slog.New(
		slogzerolog.Option{Logger: &zerologL}.NewZerologHandler(),
	)

	//logger.Info(
	//	"incoming request",
	//	slog.String("method", "GET"),
	//	slog.String("path", "/api/user"),
	//	slog.Int("status", 200),
	//)

	logger.Error("something went wrong", net.ErrClosed,
		"status", http.StatusInternalServerError)

	slog.SetDefault(logger)

	//slog.Debug("Debug message")
	//slog.Info("Info message")
	//slog.Warn("Warning message")
	//slog.Error("Error message")
	slog.Error("something went wrong", net.ErrClosed,
		"status", http.StatusInternalServerError)

	//log.Print("something went wrong")
	//log.Fatalln("something went wrong")

}

// https://github.com/samber/slog-logrus/blob/main/example/example.go
func InitLogLogrus() {
	logrusLogger := logrus.New()

	logger := slog.New(sloglogrus.Option{Level: slog.LevelDebug, Logger: logrusLogger}.NewLogrusHandler())
	//logger = logger.With("release", "v1.0.0")

	logger.Error("something went wrong", net.ErrClosed,
		"status", http.StatusInternalServerError)

	slog.SetDefault(logger)

	//slog.Debug("Debug message")
	//slog.Info("Info message")
	//slog.Warn("Warning message")
	//slog.Error("Error message")
	slog.Error("something went wrong", net.ErrClosed,
		"status", http.StatusInternalServerError)

	//log.Print("something went wrong")
	//log.Fatalln("something went wrong")
}
