/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package linkjvm.low.datalog;

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
        linkjvm_datalogJNI.delete_Category(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void append(String data) {
    linkjvm_datalogJNI.Category_append__SWIG_0(swigCPtr, this, data);
  }

  public void append(double data) {
    linkjvm_datalogJNI.Category_append__SWIG_1(swigCPtr, this, data);
  }

  public void remove(long index) {
    linkjvm_datalogJNI.Category_remove(swigCPtr, this, index);
  }

  public SWIGTYPE_p_std__vectorT_std__string_t entries() {
    return new SWIGTYPE_p_std__vectorT_std__string_t(linkjvm_datalogJNI.Category_entries(swigCPtr, this), false);
  }

  public String name() {
    return linkjvm_datalogJNI.Category_name(swigCPtr, this);
  }

}
