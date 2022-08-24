/**
 * Severalnines ClusterControl
 * This is a ...
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: sales@severalnines.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.SeveralninesClusterControl);
  }
}(this, function(expect, SeveralninesClusterControl) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new SeveralninesClusterControl.JobsJobJobSpecJobDataNode();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('JobsJobJobSpecJobDataNode', function() {
    it('should create an instance of JobsJobJobSpecJobDataNode', function() {
      // uncomment below and update the code to test JobsJobJobSpecJobDataNode
      //var instance = new SeveralninesClusterControl.JobsJobJobSpecJobDataNode();
      //expect(instance).to.be.a(SeveralninesClusterControl.JobsJobJobSpecJobDataNode);
    });

    it('should have the property backendNameRo (base name: "backend_name_ro")', function() {
      // uncomment below and update the code to test the property backendNameRo
      //var instance = new SeveralninesClusterControl.JobsJobJobSpecJobDataNode();
      //expect(instance).to.be();
    });

    it('should have the property backendNameRw (base name: "backend_name_rw")', function() {
      // uncomment below and update the code to test the property backendNameRw
      //var instance = new SeveralninesClusterControl.JobsJobJobSpecJobDataNode();
      //expect(instance).to.be();
    });

    it('should have the property dataRetention (base name: "data_retention")', function() {
      // uncomment below and update the code to test the property dataRetention
      //var instance = new SeveralninesClusterControl.JobsJobJobSpecJobDataNode();
      //expect(instance).to.be();
    });

    it('should have the property dataRetentionSize (base name: "data_retention_size")', function() {
      // uncomment below and update the code to test the property dataRetentionSize
      //var instance = new SeveralninesClusterControl.JobsJobJobSpecJobDataNode();
      //expect(instance).to.be();
    });

    it('should have the property hostname (base name: "hostname")', function() {
      // uncomment below and update the code to test the property hostname
      //var instance = new SeveralninesClusterControl.JobsJobJobSpecJobDataNode();
      //expect(instance).to.be();
    });

    it('should have the property lbAdmin (base name: "lb_admin")', function() {
      // uncomment below and update the code to test the property lbAdmin
      //var instance = new SeveralninesClusterControl.JobsJobJobSpecJobDataNode();
      //expect(instance).to.be();
    });

    it('should have the property lbPassword (base name: "lb_password")', function() {
      // uncomment below and update the code to test the property lbPassword
      //var instance = new SeveralninesClusterControl.JobsJobJobSpecJobDataNode();
      //expect(instance).to.be();
    });

    it('should have the property lbPolicy (base name: "lb_policy")', function() {
      // uncomment below and update the code to test the property lbPolicy
      //var instance = new SeveralninesClusterControl.JobsJobJobSpecJobDataNode();
      //expect(instance).to.be();
    });

    it('should have the property maxConnectionBe (base name: "max_connection_be")', function() {
      // uncomment below and update the code to test the property maxConnectionBe
      //var instance = new SeveralninesClusterControl.JobsJobJobSpecJobDataNode();
      //expect(instance).to.be();
    });

    it('should have the property maxConnectionFe (base name: "max_connection_fe")', function() {
      // uncomment below and update the code to test the property maxConnectionFe
      //var instance = new SeveralninesClusterControl.JobsJobJobSpecJobDataNode();
      //expect(instance).to.be();
    });

    it('should have the property port (base name: "port")', function() {
      // uncomment below and update the code to test the property port
      //var instance = new SeveralninesClusterControl.JobsJobJobSpecJobDataNode();
      //expect(instance).to.be();
    });

    it('should have the property roPort (base name: "ro_port")', function() {
      // uncomment below and update the code to test the property roPort
      //var instance = new SeveralninesClusterControl.JobsJobJobSpecJobDataNode();
      //expect(instance).to.be();
    });

    it('should have the property rwPort (base name: "rw_port")', function() {
      // uncomment below and update the code to test the property rwPort
      //var instance = new SeveralninesClusterControl.JobsJobJobSpecJobDataNode();
      //expect(instance).to.be();
    });

    it('should have the property rwSplitting (base name: "rw_splitting")', function() {
      // uncomment below and update the code to test the property rwSplitting
      //var instance = new SeveralninesClusterControl.JobsJobJobSpecJobDataNode();
      //expect(instance).to.be();
    });

    it('should have the property statsSocket (base name: "stats_socket")', function() {
      // uncomment below and update the code to test the property statsSocket
      //var instance = new SeveralninesClusterControl.JobsJobJobSpecJobDataNode();
      //expect(instance).to.be();
    });

    it('should have the property timeoutClient (base name: "timeout_client")', function() {
      // uncomment below and update the code to test the property timeoutClient
      //var instance = new SeveralninesClusterControl.JobsJobJobSpecJobDataNode();
      //expect(instance).to.be();
    });

    it('should have the property timeoutServer (base name: "timeout_server")', function() {
      // uncomment below and update the code to test the property timeoutServer
      //var instance = new SeveralninesClusterControl.JobsJobJobSpecJobDataNode();
      //expect(instance).to.be();
    });

    it('should have the property xinetdAllowFrom (base name: "xinetd_allow_from")', function() {
      // uncomment below and update the code to test the property xinetdAllowFrom
      //var instance = new SeveralninesClusterControl.JobsJobJobSpecJobDataNode();
      //expect(instance).to.be();
    });

    it('should have the property scrapeInterval (base name: "scrape_interval")', function() {
      // uncomment below and update the code to test the property scrapeInterval
      //var instance = new SeveralninesClusterControl.JobsJobJobSpecJobDataNode();
      //expect(instance).to.be();
    });

    it('should have the property configuration (base name: "configuration")', function() {
      // uncomment below and update the code to test the property configuration
      //var instance = new SeveralninesClusterControl.JobsJobJobSpecJobDataNode();
      //expect(instance).to.be();
    });

  });

}));