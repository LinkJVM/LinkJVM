/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.github.linkjvm.jni.camera;

public class Config {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Config(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Config obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        linkjvm_cameraJNI.delete_Config(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Config() {
    this(linkjvm_cameraJNI.new_Config__SWIG_0(), true);
  }

  public Config(SWIGTYPE_p_std__mapT_std__string_std__string_t config) {
    this(linkjvm_cameraJNI.new_Config__SWIG_1(SWIGTYPE_p_std__mapT_std__string_std__string_t.getCPtr(config)), true);
  }

  public static Config load(String path) {
    long cPtr = linkjvm_cameraJNI.Config_load(path);
    return (cPtr == 0) ? null : new Config(cPtr, false);
  }

  public boolean save(String path) {
    return linkjvm_cameraJNI.Config_save(swigCPtr, this, path);
  }

  public void beginGroup(String group) {
    linkjvm_cameraJNI.Config_beginGroup(swigCPtr, this, group);
  }

  public void endGroup() {
    linkjvm_cameraJNI.Config_endGroup(swigCPtr, this);
  }

  public void clearGroup() {
    linkjvm_cameraJNI.Config_clearGroup(swigCPtr, this);
  }

  public void clear() {
    linkjvm_cameraJNI.Config_clear(swigCPtr, this);
  }

  public boolean containsKey(String key) {
    return linkjvm_cameraJNI.Config_containsKey(swigCPtr, this, key);
  }

  public boolean boolValue(String key) {
    return linkjvm_cameraJNI.Config_boolValue(swigCPtr, this, key);
  }

  public int intValue(String key) {
    return linkjvm_cameraJNI.Config_intValue(swigCPtr, this, key);
  }

  public double doubleValue(String key) {
    return linkjvm_cameraJNI.Config_doubleValue(swigCPtr, this, key);
  }

  public String stringValue(String key) {
    return linkjvm_cameraJNI.Config_stringValue(swigCPtr, this, key);
  }

  public void setValue(String key, boolean value) {
    linkjvm_cameraJNI.Config_setValue__SWIG_0(swigCPtr, this, key, value);
  }

  public void setValue(String key, int value) {
    linkjvm_cameraJNI.Config_setValue__SWIG_1(swigCPtr, this, key, value);
  }

  public void setValue(String key, double value) {
    linkjvm_cameraJNI.Config_setValue__SWIG_2(swigCPtr, this, key, value);
  }

  public void setValue(String key, String value) {
    linkjvm_cameraJNI.Config_setValue__SWIG_3(swigCPtr, this, key, value);
  }

  public Config values() {
    return new Config(linkjvm_cameraJNI.Config_values(swigCPtr, this), true);
  }

  public void addValues(Config config) {
    linkjvm_cameraJNI.Config_addValues(swigCPtr, this, Config.getCPtr(config), config);
  }

}
