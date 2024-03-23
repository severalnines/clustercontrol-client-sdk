# StatPrometheus

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Operation** | **string** |  | 
**ClusterId** | Pointer to **int32** |  | [optional] 
**ClusterName** | Pointer to **string** |  | [optional] 
**Queries** | Pointer to [**[]StatPrometheusQueriesInner**](StatPrometheusQueriesInner.md) |  | [optional] 
**Start** | Pointer to **int32** | Seconds since 1970. e.g. 1622105617 | [optional] 
**End** | Pointer to **int32** | Seconds since 1970. e.g. 1622108317 | [optional] 
**Step** | Pointer to **int32** |  | [optional] 
**Returnfrom** | Pointer to **int32** |  | [optional] 

## Methods

### NewStatPrometheus

`func NewStatPrometheus(operation string, ) *StatPrometheus`

NewStatPrometheus instantiates a new StatPrometheus object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewStatPrometheusWithDefaults

`func NewStatPrometheusWithDefaults() *StatPrometheus`

NewStatPrometheusWithDefaults instantiates a new StatPrometheus object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOperation

`func (o *StatPrometheus) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *StatPrometheus) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *StatPrometheus) SetOperation(v string)`

SetOperation sets Operation field to given value.


### GetClusterId

`func (o *StatPrometheus) GetClusterId() int32`

GetClusterId returns the ClusterId field if non-nil, zero value otherwise.

### GetClusterIdOk

`func (o *StatPrometheus) GetClusterIdOk() (*int32, bool)`

GetClusterIdOk returns a tuple with the ClusterId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterId

`func (o *StatPrometheus) SetClusterId(v int32)`

SetClusterId sets ClusterId field to given value.

### HasClusterId

`func (o *StatPrometheus) HasClusterId() bool`

HasClusterId returns a boolean if a field has been set.

### GetClusterName

`func (o *StatPrometheus) GetClusterName() string`

GetClusterName returns the ClusterName field if non-nil, zero value otherwise.

### GetClusterNameOk

`func (o *StatPrometheus) GetClusterNameOk() (*string, bool)`

GetClusterNameOk returns a tuple with the ClusterName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterName

`func (o *StatPrometheus) SetClusterName(v string)`

SetClusterName sets ClusterName field to given value.

### HasClusterName

`func (o *StatPrometheus) HasClusterName() bool`

HasClusterName returns a boolean if a field has been set.

### GetQueries

`func (o *StatPrometheus) GetQueries() []StatPrometheusQueriesInner`

GetQueries returns the Queries field if non-nil, zero value otherwise.

### GetQueriesOk

`func (o *StatPrometheus) GetQueriesOk() (*[]StatPrometheusQueriesInner, bool)`

GetQueriesOk returns a tuple with the Queries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQueries

`func (o *StatPrometheus) SetQueries(v []StatPrometheusQueriesInner)`

SetQueries sets Queries field to given value.

### HasQueries

`func (o *StatPrometheus) HasQueries() bool`

HasQueries returns a boolean if a field has been set.

### GetStart

`func (o *StatPrometheus) GetStart() int32`

GetStart returns the Start field if non-nil, zero value otherwise.

### GetStartOk

`func (o *StatPrometheus) GetStartOk() (*int32, bool)`

GetStartOk returns a tuple with the Start field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStart

`func (o *StatPrometheus) SetStart(v int32)`

SetStart sets Start field to given value.

### HasStart

`func (o *StatPrometheus) HasStart() bool`

HasStart returns a boolean if a field has been set.

### GetEnd

`func (o *StatPrometheus) GetEnd() int32`

GetEnd returns the End field if non-nil, zero value otherwise.

### GetEndOk

`func (o *StatPrometheus) GetEndOk() (*int32, bool)`

GetEndOk returns a tuple with the End field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnd

`func (o *StatPrometheus) SetEnd(v int32)`

SetEnd sets End field to given value.

### HasEnd

`func (o *StatPrometheus) HasEnd() bool`

HasEnd returns a boolean if a field has been set.

### GetStep

`func (o *StatPrometheus) GetStep() int32`

GetStep returns the Step field if non-nil, zero value otherwise.

### GetStepOk

`func (o *StatPrometheus) GetStepOk() (*int32, bool)`

GetStepOk returns a tuple with the Step field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStep

`func (o *StatPrometheus) SetStep(v int32)`

SetStep sets Step field to given value.

### HasStep

`func (o *StatPrometheus) HasStep() bool`

HasStep returns a boolean if a field has been set.

### GetReturnfrom

`func (o *StatPrometheus) GetReturnfrom() int32`

GetReturnfrom returns the Returnfrom field if non-nil, zero value otherwise.

### GetReturnfromOk

`func (o *StatPrometheus) GetReturnfromOk() (*int32, bool)`

GetReturnfromOk returns a tuple with the Returnfrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReturnfrom

`func (o *StatPrometheus) SetReturnfrom(v int32)`

SetReturnfrom sets Returnfrom field to given value.

### HasReturnfrom

`func (o *StatPrometheus) HasReturnfrom() bool`

HasReturnfrom returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


