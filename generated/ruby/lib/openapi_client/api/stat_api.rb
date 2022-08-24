=begin
#Severalnines ClusterControl

#This is a ...

The version of the OpenAPI document: 1.0.0
Contact: sales@severalnines.com
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.4.0

=end

require 'cgi'

module OpenapiClient
  class StatApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # GetInfo | etc
    # @param stat [Stat] Provides calls to access various statistical information about the cluster
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def stat_post(stat, opts = {})
      stat_post_with_http_info(stat, opts)
      nil
    end

    # GetInfo | etc
    # @param stat [Stat] Provides calls to access various statistical information about the cluster
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def stat_post_with_http_info(stat, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: StatApi.stat_post ...'
      end
      # verify the required parameter 'stat' is set
      if @api_client.config.client_side_validation && stat.nil?
        fail ArgumentError, "Missing the required parameter 'stat' when calling StatApi.stat_post"
      end
      # resource path
      local_var_path = '/stat'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Content-Type'
      content_type = @api_client.select_header_content_type(['application/json'])
      if !content_type.nil?
          header_params['Content-Type'] = content_type
      end

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body] || @api_client.object_to_http_body(stat)

      # return_type
      return_type = opts[:debug_return_type]

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"StatApi.stat_post",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: StatApi#stat_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
