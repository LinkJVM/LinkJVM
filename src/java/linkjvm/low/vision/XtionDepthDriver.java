/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package linkjvm.low.vision;

public class XtionDepthDriver {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected XtionDepthDriver(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(XtionDepthDriver obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        linkjvm_visionJNI.delete_XtionDepthDriver(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static XtionDepthDriver instance() {
    return new XtionDepthDriver(linkjvm_visionJNI.XtionDepthDriver_instance(), false);
  }

  public void open() {
    linkjvm_visionJNI.XtionDepthDriver_open(swigCPtr, this);
  }

  public void close() {
    linkjvm_visionJNI.XtionDepthDriver_close(swigCPtr, this);
  }

  public boolean isOpen() {
    return linkjvm_visionJNI.XtionDepthDriver_isOpen(swigCPtr, this);
  }

  public DepthResolution depthCameraResolution() {
    return DepthResolution.swigToEnum(linkjvm_visionJNI.XtionDepthDriver_depthCameraResolution(swigCPtr, this));
  }

  public void setDepthCameraResolution(DepthResolution resolution) {
    linkjvm_visionJNI.XtionDepthDriver_setDepthCameraResolution(swigCPtr, this, resolution.swigValue());
  }

  public DepthImage depthImage() {
    long cPtr = linkjvm_visionJNI.XtionDepthDriver_depthImage(swigCPtr, this);
    return (cPtr == 0) ? null : new DepthImage(cPtr, false);
  }

}