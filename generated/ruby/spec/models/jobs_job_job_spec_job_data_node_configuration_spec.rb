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
require 'date'

# Unit tests for OpenapiClient::JobsJobJobSpecJobDataNodeConfiguration
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe OpenapiClient::JobsJobJobSpecJobDataNodeConfiguration do
  let(:instance) { OpenapiClient::JobsJobJobSpecJobDataNodeConfiguration.new }

  describe 'test an instance of JobsJobJobSpecJobDataNodeConfiguration' do
    it 'should create an instance of JobsJobJobSpecJobDataNodeConfiguration' do
      expect(instance).to be_instance_of(OpenapiClient::JobsJobJobSpecJobDataNodeConfiguration)
    end
  end
  describe 'test attribute "arguments"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "job"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["node", "mysqld", "mongo"])
      # validator.allowable_values.each do |value|
      #   expect { instance.job = value }.not_to raise_error
      # end
    end
  end

  describe 'test attribute "scrape_interval"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
