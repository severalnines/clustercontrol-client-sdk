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

# Unit tests for OpenapiClient::ConfigApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'ConfigApi' do
  before do
    # run before each test
    @api_instance = OpenapiClient::ConfigApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of ConfigApi' do
    it 'should create an instance of ConfigApi' do
      expect(@api_instance).to be_instance_of(OpenapiClient::ConfigApi)
    end
  end

  # unit tests for config_post
  # GetConfig | xxx | xxx | etc
  # @param config Provides access to various Cmon configuration files
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'config_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
