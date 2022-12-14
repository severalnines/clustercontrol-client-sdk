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

# Unit tests for OpenapiClient::DiscoveryJobJobSpecJobData
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe OpenapiClient::DiscoveryJobJobSpecJobData do
  let(:instance) { OpenapiClient::DiscoveryJobJobSpecJobData.new }

  describe 'test an instance of DiscoveryJobJobSpecJobData' do
    it 'should create an instance of DiscoveryJobJobSpecJobData' do
      expect(instance).to be_instance_of(OpenapiClient::DiscoveryJobJobSpecJobData)
    end
  end
  describe 'test attribute "cluster_type"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["group_replication"])
      # validator.allowable_values.each do |value|
      #   expect { instance.cluster_type = value }.not_to raise_error
      # end
    end
  end

  describe 'test attribute "mysql_version"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "vendor"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "nodes"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
