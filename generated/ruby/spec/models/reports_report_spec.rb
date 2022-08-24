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

# Unit tests for OpenapiClient::ReportsReport
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe OpenapiClient::ReportsReport do
  let(:instance) { OpenapiClient::ReportsReport.new }

  describe 'test an instance of ReportsReport' do
    it 'should create an instance of ReportsReport' do
      expect(instance).to be_instance_of(OpenapiClient::ReportsReport)
    end
  end
  describe 'test attribute "class_name"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["CmonReport"])
      # validator.allowable_values.each do |value|
      #   expect { instance.class_name = value }.not_to raise_error
      # end
    end
  end

  describe 'test attribute "recipients"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "report_type"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "text_format"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["AnsiTerminal"])
      # validator.allowable_values.each do |value|
      #   expect { instance.text_format = value }.not_to raise_error
      # end
    end
  end

  describe 'test attribute "report_id"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end