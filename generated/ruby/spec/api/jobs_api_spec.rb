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

# Unit tests for OpenapiClient::JobsApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'JobsApi' do
  before do
    # run before each test
    @api_instance = OpenapiClient::JobsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of JobsApi' do
    it 'should create an instance of JobsApi' do
      expect(@api_instance).to be_instance_of(OpenapiClient::JobsApi)
    end
  end

  # unit tests for jobs_post
  # CreateJobInstance | etc
  # @param jobs Creating, manipulating, and obtaining information about jobs
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'jobs_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
