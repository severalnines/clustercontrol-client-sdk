=begin
#Severalnines ClusterControl

#This is a ...

The version of the OpenAPI document: 1.0.0
Contact: sales@severalnines.com
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.4.0

=end

require 'spec_helper'
require 'json'

# Unit tests for OpenapiClient::ReportsApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'ReportsApi' do
  before do
    # run before each test
    @api_instance = OpenapiClient::ReportsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of ReportsApi' do
    it 'should create an instance of ReportsApi' do
      expect(@api_instance).to be_instance_of(OpenapiClient::ReportsApi)
    end
  end

  # unit tests for reports_post
  # GenerateReport | etc
  # @param reports Provides access to reports generated by the Cmon controller
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'reports_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end