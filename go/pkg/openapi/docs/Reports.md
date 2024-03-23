# Reports

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Operation** | **string** |  | 
**ClusterId** | Pointer to **int32** |  | [optional] 
**Report** | Pointer to [**ReportsReport**](ReportsReport.md) |  | [optional] 

## Methods

### NewReports

`func NewReports(operation string, ) *Reports`

NewReports instantiates a new Reports object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewReportsWithDefaults

`func NewReportsWithDefaults() *Reports`

NewReportsWithDefaults instantiates a new Reports object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOperation

`func (o *Reports) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *Reports) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *Reports) SetOperation(v string)`

SetOperation sets Operation field to given value.


### GetClusterId

`func (o *Reports) GetClusterId() int32`

GetClusterId returns the ClusterId field if non-nil, zero value otherwise.

### GetClusterIdOk

`func (o *Reports) GetClusterIdOk() (*int32, bool)`

GetClusterIdOk returns a tuple with the ClusterId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterId

`func (o *Reports) SetClusterId(v int32)`

SetClusterId sets ClusterId field to given value.

### HasClusterId

`func (o *Reports) HasClusterId() bool`

HasClusterId returns a boolean if a field has been set.

### GetReport

`func (o *Reports) GetReport() ReportsReport`

GetReport returns the Report field if non-nil, zero value otherwise.

### GetReportOk

`func (o *Reports) GetReportOk() (*ReportsReport, bool)`

GetReportOk returns a tuple with the Report field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReport

`func (o *Reports) SetReport(v ReportsReport)`

SetReport sets Report field to given value.

### HasReport

`func (o *Reports) HasReport() bool`

HasReport returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


