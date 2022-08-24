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
  class ConfigLdapConfiguration
    attr_accessor :enabled

    attr_accessor :ldap_admin_password

    attr_accessor :ldap_admin_user

    attr_accessor :ldap_group_search_root

    attr_accessor :ldap_server_uri

    attr_accessor :ldap_user_search_root

    attr_accessor :group_mappings

    attr_accessor :ldap_settings

    attr_accessor :security

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'enabled' => :'enabled',
        :'ldap_admin_password' => :'ldapAdminPassword',
        :'ldap_admin_user' => :'ldapAdminUser',
        :'ldap_group_search_root' => :'ldapGroupSearchRoot',
        :'ldap_server_uri' => :'ldapServerUri',
        :'ldap_user_search_root' => :'ldapUserSearchRoot',
        :'group_mappings' => :'groupMappings',
        :'ldap_settings' => :'ldapSettings',
        :'security' => :'security'
      }
    end

    # Returns all the JSON keys this model knows about
    def self.acceptable_attributes
      attribute_map.values
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'enabled' => :'Boolean',
        :'ldap_admin_password' => :'String',
        :'ldap_admin_user' => :'String',
        :'ldap_group_search_root' => :'String',
        :'ldap_server_uri' => :'String',
        :'ldap_user_search_root' => :'String',
        :'group_mappings' => :'Array<ConfigLdapConfigurationGroupMappings>',
        :'ldap_settings' => :'ConfigLdapConfigurationLdapSettings',
        :'security' => :'ConfigLdapConfigurationSecurity'
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
        fail ArgumentError, "The input argument (attributes) must be a hash in `OpenapiClient::ConfigLdapConfiguration` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `OpenapiClient::ConfigLdapConfiguration`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'enabled')
        self.enabled = attributes[:'enabled']
      end

      if attributes.key?(:'ldap_admin_password')
        self.ldap_admin_password = attributes[:'ldap_admin_password']
      end

      if attributes.key?(:'ldap_admin_user')
        self.ldap_admin_user = attributes[:'ldap_admin_user']
      end

      if attributes.key?(:'ldap_group_search_root')
        self.ldap_group_search_root = attributes[:'ldap_group_search_root']
      end

      if attributes.key?(:'ldap_server_uri')
        self.ldap_server_uri = attributes[:'ldap_server_uri']
      end

      if attributes.key?(:'ldap_user_search_root')
        self.ldap_user_search_root = attributes[:'ldap_user_search_root']
      end

      if attributes.key?(:'group_mappings')
        if (value = attributes[:'group_mappings']).is_a?(Array)
          self.group_mappings = value
        end
      end

      if attributes.key?(:'ldap_settings')
        self.ldap_settings = attributes[:'ldap_settings']
      end

      if attributes.key?(:'security')
        self.security = attributes[:'security']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          enabled == o.enabled &&
          ldap_admin_password == o.ldap_admin_password &&
          ldap_admin_user == o.ldap_admin_user &&
          ldap_group_search_root == o.ldap_group_search_root &&
          ldap_server_uri == o.ldap_server_uri &&
          ldap_user_search_root == o.ldap_user_search_root &&
          group_mappings == o.group_mappings &&
          ldap_settings == o.ldap_settings &&
          security == o.security
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [enabled, ldap_admin_password, ldap_admin_user, ldap_group_search_root, ldap_server_uri, ldap_user_search_root, group_mappings, ldap_settings, security].hash
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
