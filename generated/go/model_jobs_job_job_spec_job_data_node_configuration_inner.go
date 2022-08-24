/*
Severalnines ClusterControl

This is a ...

API version: 1.0.0
Contact: sales@severalnines.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
)

// JobsJobJobSpecJobDataNodeConfigurationInner struct for JobsJobJobSpecJobDataNodeConfigurationInner
type JobsJobJobSpecJobDataNodeConfigurationInner struct {
	Arguments *string `json:"arguments,omitempty"`
	Job *string `json:"job,omitempty"`
	ScrapeInterval *string `json:"scrape_interval,omitempty"`
}

// NewJobsJobJobSpecJobDataNodeConfigurationInner instantiates a new JobsJobJobSpecJobDataNodeConfigurationInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewJobsJobJobSpecJobDataNodeConfigurationInner() *JobsJobJobSpecJobDataNodeConfigurationInner {
	this := JobsJobJobSpecJobDataNodeConfigurationInner{}
	return &this
}

// NewJobsJobJobSpecJobDataNodeConfigurationInnerWithDefaults instantiates a new JobsJobJobSpecJobDataNodeConfigurationInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewJobsJobJobSpecJobDataNodeConfigurationInnerWithDefaults() *JobsJobJobSpecJobDataNodeConfigurationInner {
	this := JobsJobJobSpecJobDataNodeConfigurationInner{}
	return &this
}

// GetArguments returns the Arguments field value if set, zero value otherwise.
func (o *JobsJobJobSpecJobDataNodeConfigurationInner) GetArguments() string {
	if o == nil || o.Arguments == nil {
		var ret string
		return ret
	}
	return *o.Arguments
}

// GetArgumentsOk returns a tuple with the Arguments field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *JobsJobJobSpecJobDataNodeConfigurationInner) GetArgumentsOk() (*string, bool) {
	if o == nil || o.Arguments == nil {
		return nil, false
	}
	return o.Arguments, true
}

// HasArguments returns a boolean if a field has been set.
func (o *JobsJobJobSpecJobDataNodeConfigurationInner) HasArguments() bool {
	if o != nil && o.Arguments != nil {
		return true
	}

	return false
}

// SetArguments gets a reference to the given string and assigns it to the Arguments field.
func (o *JobsJobJobSpecJobDataNodeConfigurationInner) SetArguments(v string) {
	o.Arguments = &v
}

// GetJob returns the Job field value if set, zero value otherwise.
func (o *JobsJobJobSpecJobDataNodeConfigurationInner) GetJob() string {
	if o == nil || o.Job == nil {
		var ret string
		return ret
	}
	return *o.Job
}

// GetJobOk returns a tuple with the Job field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *JobsJobJobSpecJobDataNodeConfigurationInner) GetJobOk() (*string, bool) {
	if o == nil || o.Job == nil {
		return nil, false
	}
	return o.Job, true
}

// HasJob returns a boolean if a field has been set.
func (o *JobsJobJobSpecJobDataNodeConfigurationInner) HasJob() bool {
	if o != nil && o.Job != nil {
		return true
	}

	return false
}

// SetJob gets a reference to the given string and assigns it to the Job field.
func (o *JobsJobJobSpecJobDataNodeConfigurationInner) SetJob(v string) {
	o.Job = &v
}

// GetScrapeInterval returns the ScrapeInterval field value if set, zero value otherwise.
func (o *JobsJobJobSpecJobDataNodeConfigurationInner) GetScrapeInterval() string {
	if o == nil || o.ScrapeInterval == nil {
		var ret string
		return ret
	}
	return *o.ScrapeInterval
}

// GetScrapeIntervalOk returns a tuple with the ScrapeInterval field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *JobsJobJobSpecJobDataNodeConfigurationInner) GetScrapeIntervalOk() (*string, bool) {
	if o == nil || o.ScrapeInterval == nil {
		return nil, false
	}
	return o.ScrapeInterval, true
}

// HasScrapeInterval returns a boolean if a field has been set.
func (o *JobsJobJobSpecJobDataNodeConfigurationInner) HasScrapeInterval() bool {
	if o != nil && o.ScrapeInterval != nil {
		return true
	}

	return false
}

// SetScrapeInterval gets a reference to the given string and assigns it to the ScrapeInterval field.
func (o *JobsJobJobSpecJobDataNodeConfigurationInner) SetScrapeInterval(v string) {
	o.ScrapeInterval = &v
}

func (o JobsJobJobSpecJobDataNodeConfigurationInner) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Arguments != nil {
		toSerialize["arguments"] = o.Arguments
	}
	if o.Job != nil {
		toSerialize["job"] = o.Job
	}
	if o.ScrapeInterval != nil {
		toSerialize["scrape_interval"] = o.ScrapeInterval
	}
	return json.Marshal(toSerialize)
}

type NullableJobsJobJobSpecJobDataNodeConfigurationInner struct {
	value *JobsJobJobSpecJobDataNodeConfigurationInner
	isSet bool
}

func (v NullableJobsJobJobSpecJobDataNodeConfigurationInner) Get() *JobsJobJobSpecJobDataNodeConfigurationInner {
	return v.value
}

func (v *NullableJobsJobJobSpecJobDataNodeConfigurationInner) Set(val *JobsJobJobSpecJobDataNodeConfigurationInner) {
	v.value = val
	v.isSet = true
}

func (v NullableJobsJobJobSpecJobDataNodeConfigurationInner) IsSet() bool {
	return v.isSet
}

func (v *NullableJobsJobJobSpecJobDataNodeConfigurationInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableJobsJobJobSpecJobDataNodeConfigurationInner(val *JobsJobJobSpecJobDataNodeConfigurationInner) *NullableJobsJobJobSpecJobDataNodeConfigurationInner {
	return &NullableJobsJobJobSpecJobDataNodeConfigurationInner{value: val, isSet: true}
}

func (v NullableJobsJobJobSpecJobDataNodeConfigurationInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableJobsJobJobSpecJobDataNodeConfigurationInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


