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
    instance = new SeveralninesClusterControl.Maintenance();
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

  describe('Maintenance', function() {
    it('should create an instance of Maintenance', function() {
      // uncomment below and update the code to test Maintenance
      //var instance = new SeveralninesClusterControl.Maintenance();
      //expect(instance).to.be.a(SeveralninesClusterControl.Maintenance);
    });

    it('should have the property operation (base name: "operation")', function() {
      // uncomment below and update the code to test the property operation
      //var instance = new SeveralninesClusterControl.Maintenance();
      //expect(instance).to.be();
    });

    it('should have the property clusterId (base name: "cluster_id")', function() {
      // uncomment below and update the code to test the property clusterId
      //var instance = new SeveralninesClusterControl.Maintenance();
      //expect(instance).to.be();
    });

    it('should have the property deadline (base name: "deadline")', function() {
      // uncomment below and update the code to test the property deadline
      //var instance = new SeveralninesClusterControl.Maintenance();
      //expect(instance).to.be();
    });

    it('should have the property initiate (base name: "initiate")', function() {
      // uncomment below and update the code to test the property initiate
      //var instance = new SeveralninesClusterControl.Maintenance();
      //expect(instance).to.be();
    });

    it('should have the property hostname (base name: "hostname")', function() {
      // uncomment below and update the code to test the property hostname
      //var instance = new SeveralninesClusterControl.Maintenance();
      //expect(instance).to.be();
    });

    it('should have the property UUID (base name: "UUID")', function() {
      // uncomment below and update the code to test the property UUID
      //var instance = new SeveralninesClusterControl.Maintenance();
      //expect(instance).to.be();
    });

  });

}));
