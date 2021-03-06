/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package linkjvm.low.vision;

public class ChannelImplManager {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ChannelImplManager(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ChannelImplManager obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        linkjvm_visionJNI.delete_ChannelImplManager(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setImage(SWIGTYPE_p_cv__Mat image) {
    linkjvm_visionJNI.ChannelImplManager_setImage(swigCPtr, this, SWIGTYPE_p_cv__Mat.getCPtr(image));
  }

  public ChannelImpl channelImpl(String name) {
    long cPtr = linkjvm_visionJNI.ChannelImplManager_channelImpl(swigCPtr, this, name);
    return (cPtr == 0) ? null : new ChannelImpl(cPtr, false);
  }

}
