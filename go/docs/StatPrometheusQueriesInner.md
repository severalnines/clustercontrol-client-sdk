# StatPrometheusQueriesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Query** | Pointer to **string** | mysql_global_status_wsrep_cert_deps_distance{instance&#x3D;~\&quot;10.117.12.165(:[0-9]+)?\&quot;} | [optional] 
**Step** | Pointer to **int32** | e.g. 10 | [optional] 

## Methods

### NewStatPrometheusQueriesInner

`func NewStatPrometheusQueriesInner() *StatPrometheusQueriesInner`

NewStatPrometheusQueriesInner instantiates a new StatPrometheusQueriesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewStatPrometheusQueriesInnerWithDefaults

`func NewStatPrometheusQueriesInnerWithDefaults() *StatPrometheusQueriesInner`

NewStatPrometheusQueriesInnerWithDefaults instantiates a new StatPrometheusQueriesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetQuery

`func (o *StatPrometheusQueriesInner) GetQuery() string`

GetQuery returns the Query field if non-nil, zero value otherwise.

### GetQueryOk

`func (o *StatPrometheusQueriesInner) GetQueryOk() (*string, bool)`

GetQueryOk returns a tuple with the Query field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuery

`func (o *StatPrometheusQueriesInner) SetQuery(v string)`

SetQuery sets Query field to given value.

### HasQuery

`func (o *StatPrometheusQueriesInner) HasQuery() bool`

HasQuery returns a boolean if a field has been set.

### GetStep

`func (o *StatPrometheusQueriesInner) GetStep() int32`

GetStep returns the Step field if non-nil, zero value otherwise.

### GetStepOk

`func (o *StatPrometheusQueriesInner) GetStepOk() (*int32, bool)`

GetStepOk returns a tuple with the Step field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStep

`func (o *StatPrometheusQueriesInner) SetStep(v int32)`

SetStep sets Step field to given value.

### HasStep

`func (o *StatPrometheusQueriesInner) HasStep() bool`

HasStep returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


