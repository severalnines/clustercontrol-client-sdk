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
    instance = new SeveralninesClusterControl.JobsJobJobSpecJobDataMembers();
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

  describe('JobsJobJobSpecJobDataMembers', function() {
    it('should create an instance of JobsJobJobSpecJobDataMembers', function() {
      // uncomment below and update the code to test JobsJobJobSpecJobDataMembers
      //var instance = new SeveralninesClusterControl.JobsJobJobSpecJobDataMembers();
      //expect(instance).to.be.a(SeveralninesClusterControl.JobsJobJobSpecJobDataMembers);
    });

    it('should have the property hostname (base name: "hostname")', function() {
      // uncomment below and update the code to test the property hostname
      //var instance = new SeveralninesClusterControl.JobsJobJobSpecJobDataMembers();
      //expect(instance).to.be();
    });

    it('should have the property hostnameData (base name: "hostname_data")', function() {
      // uncomment below and update the code to test the property hostnameData
      //var instance = new SeveralninesClusterControl.JobsJobJobSpecJobDataMembers();
      //expect(instance).to.be();
    });

    it('should have the property hostnameInternal (base name: "hostname_internal")', function() {
      // uncomment below and update the code to test the property hostnameInternal
      //var instance = new SeveralninesClusterControl.JobsJobJobSpecJobDataMembers();
      //expect(instance).to.be();
    });

    it('should have the property port (base name: "port")', function() {
      // uncomment below and update the code to test the property port
      //var instance = new SeveralninesClusterControl.JobsJobJobSpecJobDataMembers();
      //expect(instance).to.be();
    });

    it('should have the property arbiterOnly (base name: "arbiter_only")', function() {
      // uncomment below and update the code to test the property arbiterOnly
      //var instance = new SeveralninesClusterControl.JobsJobJobSpecJobDataMembers();
      //expect(instance).to.be();
    });

    it('should have the property hidden (base name: "hidden")', function() {
      // uncomment below and update the code to test the property hidden
      //var instance = new SeveralninesClusterControl.JobsJobJobSpecJobDataMembers();
      //expect(instance).to.be();
    });

    it('should have the property priority (base name: "priority")', function() {
      // uncomment below and update the code to test the property priority
      //var instance = new SeveralninesClusterControl.JobsJobJobSpecJobDataMembers();
      //expect(instance).to.be();
    });

    it('should have the property slaveDelay (base name: "slave_delay")', function() {
      // uncomment below and update the code to test the property slaveDelay
      //var instance = new SeveralninesClusterControl.JobsJobJobSpecJobDataMembers();
      //expect(instance).to.be();
    });

  });

}));
