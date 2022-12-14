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
    instance = new SeveralninesClusterControl.Stat();
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

  describe('Stat', function() {
    it('should create an instance of Stat', function() {
      // uncomment below and update the code to test Stat
      //var instance = new SeveralninesClusterControl.Stat();
      //expect(instance).to.be.a(SeveralninesClusterControl.Stat);
    });

    it('should have the property operation (base name: "operation")', function() {
      // uncomment below and update the code to test the property operation
      //var instance = new SeveralninesClusterControl.Stat();
      //expect(instance).to.be();
    });

    it('should have the property clusterId (base name: "cluster_id")', function() {
      // uncomment below and update the code to test the property clusterId
      //var instance = new SeveralninesClusterControl.Stat();
      //expect(instance).to.be();
    });

    it('should have the property name (base name: "name")', function() {
      // uncomment below and update the code to test the property name
      //var instance = new SeveralninesClusterControl.Stat();
      //expect(instance).to.be();
    });

    it('should have the property startDatetime (base name: "start_datetime")', function() {
      // uncomment below and update the code to test the property startDatetime
      //var instance = new SeveralninesClusterControl.Stat();
      //expect(instance).to.be();
    });

    it('should have the property endDatetime (base name: "end_datetime")', function() {
      // uncomment below and update the code to test the property endDatetime
      //var instance = new SeveralninesClusterControl.Stat();
      //expect(instance).to.be();
    });

    it('should have the property withHosts (base name: "with_hosts")', function() {
      // uncomment below and update the code to test the property withHosts
      //var instance = new SeveralninesClusterControl.Stat();
      //expect(instance).to.be();
    });

    it('should have the property calculatePerSec (base name: "calculate_per_sec")', function() {
      // uncomment below and update the code to test the property calculatePerSec
      //var instance = new SeveralninesClusterControl.Stat();
      //expect(instance).to.be();
    });

  });

}));
