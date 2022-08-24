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
    instance = new SeveralninesClusterControl.UsersUserGroups();
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

  describe('UsersUserGroups', function() {
    it('should create an instance of UsersUserGroups', function() {
      // uncomment below and update the code to test UsersUserGroups
      //var instance = new SeveralninesClusterControl.UsersUserGroups();
      //expect(instance).to.be.a(SeveralninesClusterControl.UsersUserGroups);
    });

    it('should have the property className (base name: "class_name")', function() {
      // uncomment below and update the code to test the property className
      //var instance = new SeveralninesClusterControl.UsersUserGroups();
      //expect(instance).to.be();
    });

    it('should have the property groupName (base name: "group_name")', function() {
      // uncomment below and update the code to test the property groupName
      //var instance = new SeveralninesClusterControl.UsersUserGroups();
      //expect(instance).to.be();
    });

  });

}));