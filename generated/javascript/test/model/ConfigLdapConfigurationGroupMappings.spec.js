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
    instance = new SeveralninesClusterControl.ConfigLdapConfigurationGroupMappings();
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

  describe('ConfigLdapConfigurationGroupMappings', function() {
    it('should create an instance of ConfigLdapConfigurationGroupMappings', function() {
      // uncomment below and update the code to test ConfigLdapConfigurationGroupMappings
      //var instance = new SeveralninesClusterControl.ConfigLdapConfigurationGroupMappings();
      //expect(instance).to.be.a(SeveralninesClusterControl.ConfigLdapConfigurationGroupMappings);
    });

    it('should have the property cmonGroupName (base name: "cmonGroupName")', function() {
      // uncomment below and update the code to test the property cmonGroupName
      //var instance = new SeveralninesClusterControl.ConfigLdapConfigurationGroupMappings();
      //expect(instance).to.be();
    });

    it('should have the property ldapGroupId (base name: "ldapGroupId")', function() {
      // uncomment below and update the code to test the property ldapGroupId
      //var instance = new SeveralninesClusterControl.ConfigLdapConfigurationGroupMappings();
      //expect(instance).to.be();
    });

    it('should have the property sectionName (base name: "sectionName")', function() {
      // uncomment below and update the code to test the property sectionName
      //var instance = new SeveralninesClusterControl.ConfigLdapConfigurationGroupMappings();
      //expect(instance).to.be();
    });

  });

}));
