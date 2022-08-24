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
    instance = new SeveralninesClusterControl.DiscoveryJob();
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

  describe('DiscoveryJob', function() {
    it('should create an instance of DiscoveryJob', function() {
      // uncomment below and update the code to test DiscoveryJob
      //var instance = new SeveralninesClusterControl.DiscoveryJob();
      //expect(instance).to.be.a(SeveralninesClusterControl.DiscoveryJob);
    });

    it('should have the property className (base name: "class_name")', function() {
      // uncomment below and update the code to test the property className
      //var instance = new SeveralninesClusterControl.DiscoveryJob();
      //expect(instance).to.be();
    });

    it('should have the property jobSpec (base name: "job_spec")', function() {
      // uncomment below and update the code to test the property jobSpec
      //var instance = new SeveralninesClusterControl.DiscoveryJob();
      //expect(instance).to.be();
    });

  });

}));