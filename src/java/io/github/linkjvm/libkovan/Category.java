/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.github.linkjvm.libkovan;

public class Category {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Category(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Category obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        LinkJVMJNI.delete_Category(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void append(SWIGTYPE_p_std__string data) {
    LinkJVMJNI.Category_append__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(data));
  }

  public void append(double data) {
    LinkJVMJNI.Category_append__SWIG_1(swigCPtr, this, data);
  }

  public void remove(long index) {
    LinkJVMJNI.Category_remove(swigCPtr, this, index);
  }

  public SWIGTYPE_p_std__vectorT_std__string_t entries() {
    return new SWIGTYPE_p_std__vectorT_std__string_t(LinkJVMJNI.Category_entries(swigCPtr, this), false);
  }

  public SWIGTYPE_p_std__string name() {
    return new SWIGTYPE_p_std__string(LinkJVMJNI.Category_name(swigCPtr, this), false);
  }

}
