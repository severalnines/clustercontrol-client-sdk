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

# Unit tests for OpenapiClient::Authenticate
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe OpenapiClient::Authenticate do
  let(:instance) { OpenapiClient::Authenticate.new }

  describe 'test an instance of Authenticate' do
    it 'should create an instance of Authenticate' do
      expect(instance).to be_instance_of(OpenapiClient::Authenticate)
    end
  end
  describe 'test attribute "operation"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["authenticateWithPassword", "authenticate", "authenticateresponse", "logout", "passwordReset", "newpassword"])
      # validator.allowable_values.each do |value|
      #   expect { instance.operation = value }.not_to raise_error
      # end
    end
  end

  describe 'test attribute "user_name"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "password"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "signature"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "new_password"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "password_reset_token"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end