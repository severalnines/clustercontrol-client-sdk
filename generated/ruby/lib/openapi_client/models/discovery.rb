=begin
#Severalnines ClusterControl

#This is a ...

The version of the OpenAPI document: 1.0.0
Contact: sales@severalnines.com
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.4.0

=end

require 'date'
require 'time'

module OpenapiClient
  class Discovery
    attr_accessor :operation

    attr_accessor :new_cluster_name

    attr_accessor :check_if_already_registered

    attr_accessor :check_job

    attr_accessor :check_ssh_sudo

    attr_accessor :nodes

    attr_accessor :job

    attr_accessor :ssh_credentials

    class EnumAttributeValidator
      attr_reader :datatype
      attr_reader :allowable_values

      def initialize(datatype, allowable_values)
        @allowable_values = allowable_values.map do |value|
          case datatype.to_s
          when /Integer/i
            value.to_i
          when /Float/i
            value.to_f
          else
            value
          end
        end
      end

      def valid?(value)
        !value || allowable_values.include?(value)
      end
    end

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'operation' => :'operation',
        :'new_cluster_name' => :'new_cluster_name',
        :'check_if_already_registered' => :'check_if_already_registered',
        :'check_job' => :'check_job',
        :'check_ssh_sudo' => :'check_ssh_sudo',
        :'nodes' => :'nodes',
        :'job' => :'job',
        :'ssh_credentials' => :'ssh_credentials'
      }
    end

    # Returns all the JSON keys this model knows about
    def self.acceptable_attributes
      attribute_map.values
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'operation' => :'String',
        :'new_cluster_name' => :'String',
        :'check_if_already_registered' => :'Boolean',
        :'check_job' => :'Boolean',
        :'check_ssh_sudo' => :'Boolean',
        :'nodes' => :'Array<DiscoveryNodes>',
        :'job' => :'DiscoveryJob',
        :'ssh_credentials' => :'DiscoverySshCredentials'
      }
    end

    # List of attributes with nullable: true
    def self.openapi_nullable
      Set.new([
      ])
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `OpenapiClient::Discovery` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `OpenapiClient::Discovery`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'operation')
        self.operation = attributes[:'operation']
      end

      if attributes.key?(:'new_cluster_name')
        self.new_cluster_name = attributes[:'new_cluster_name']
      end

      if attributes.key?(:'check_if_already_registered')
        self.check_if_already_registered = attributes[:'check_if_already_registered']
      end

      if attributes.key?(:'check_job')
        self.check_job = attributes[:'check_job']
      end

      if attributes.key?(:'check_ssh_sudo')
        self.check_ssh_sudo = attributes[:'check_ssh_sudo']
      end

      if attributes.key?(:'nodes')
        if (value = attributes[:'nodes']).is_a?(Array)
          self.nodes = value
        end
      end

      if attributes.key?(:'job')
        self.job = attributes[:'job']
      end

      if attributes.key?(:'ssh_credentials')
        self.ssh_credentials = attributes[:'ssh_credentials']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @operation.nil?
        invalid_properties.push('invalid value for "operation", operation cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @operation.nil?
      operation_validator = EnumAttributeValidator.new('String', ["checkClusterName", "getSupportedClusterTypes", "checkHosts"])
      return false unless operation_validator.valid?(@operation)
      true
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] operation Object to be assigned
    def operation=(operation)
      validator = EnumAttributeValidator.new('String', ["checkClusterName", "getSupportedClusterTypes", "checkHosts"])
      unless validator.valid?(operation)
        fail ArgumentError, "invalid value for \"operation\", must be one of #{validator.allowable_values}."
      end
      @operation = operation
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          operation == o.operation &&
          new_cluster_name == o.new_cluster_name &&
          check_if_already_registered == o.check_if_already_registered &&
          check_job == o.check_job &&
          check_ssh_sudo == o.check_ssh_sudo &&
          nodes == o.nodes &&
          job == o.job &&
          ssh_credentials == o.ssh_credentials
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [operation, new_cluster_name, check_if_already_registered, check_job, check_ssh_sudo, nodes, job, ssh_credentials].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def self.build_from_hash(attributes)
      new.build_from_hash(attributes)
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.openapi_types.each_pair do |key, type|
        if attributes[self.class.attribute_map[key]].nil? && self.class.openapi_nullable.include?(key)
          self.send("#{key}=", nil)
        elsif type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :Time
        Time.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :Boolean
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        # models (e.g. Pet) or oneOf
        klass = OpenapiClient.const_get(type)
        klass.respond_to?(:openapi_one_of) ? klass.build(value) : klass.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        if value.nil?
          is_nullable = self.class.openapi_nullable.include?(attr)
          next if !is_nullable || (is_nullable && !instance_variable_defined?(:"@#{attr}"))
        end

        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

  end

end
