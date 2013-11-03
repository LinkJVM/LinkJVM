/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 * 
 * This file is not intended to be easily readable and contains a number of 
 * coding conventions designed to improve portability and efficiency. Do not make
 * changes to this file unless you know what you are doing--modify the SWIG 
 * interface file instead. 
 * ----------------------------------------------------------------------------- */

#define SWIGJAVA


#ifdef __cplusplus
/* SwigValueWrapper is described in swig.swg */
template<typename T> class SwigValueWrapper {
  struct SwigMovePointer {
    T *ptr;
    SwigMovePointer(T *p) : ptr(p) { }
    ~SwigMovePointer() { delete ptr; }
    SwigMovePointer& operator=(SwigMovePointer& rhs) { T* oldptr = ptr; ptr = 0; delete oldptr; ptr = rhs.ptr; rhs.ptr = 0; return *this; }
  } pointer;
  SwigValueWrapper& operator=(const SwigValueWrapper<T>& rhs);
  SwigValueWrapper(const SwigValueWrapper<T>& rhs);
public:
  SwigValueWrapper() : pointer(0) { }
  SwigValueWrapper& operator=(const T& t) { SwigMovePointer tmp(new T(t)); pointer = tmp; return *this; }
  operator T&() const { return *pointer.ptr; }
  T *operator&() { return pointer.ptr; }
};

template <typename T> T SwigValueInit() {
  return T();
}
#endif

/* -----------------------------------------------------------------------------
 *  This section contains generic SWIG labels for method/variable
 *  declarations/attributes, and other compiler dependent labels.
 * ----------------------------------------------------------------------------- */

/* template workaround for compilers that cannot correctly implement the C++ standard */
#ifndef SWIGTEMPLATEDISAMBIGUATOR
# if defined(__SUNPRO_CC) && (__SUNPRO_CC <= 0x560)
#  define SWIGTEMPLATEDISAMBIGUATOR template
# elif defined(__HP_aCC)
/* Needed even with `aCC -AA' when `aCC -V' reports HP ANSI C++ B3910B A.03.55 */
/* If we find a maximum version that requires this, the test would be __HP_aCC <= 35500 for A.03.55 */
#  define SWIGTEMPLATEDISAMBIGUATOR template
# else
#  define SWIGTEMPLATEDISAMBIGUATOR
# endif
#endif

/* inline attribute */
#ifndef SWIGINLINE
# if defined(__cplusplus) || (defined(__GNUC__) && !defined(__STRICT_ANSI__))
#   define SWIGINLINE inline
# else
#   define SWIGINLINE
# endif
#endif

/* attribute recognised by some compilers to avoid 'unused' warnings */
#ifndef SWIGUNUSED
# if defined(__GNUC__)
#   if !(defined(__cplusplus)) || (__GNUC__ > 3 || (__GNUC__ == 3 && __GNUC_MINOR__ >= 4))
#     define SWIGUNUSED __attribute__ ((__unused__)) 
#   else
#     define SWIGUNUSED
#   endif
# elif defined(__ICC)
#   define SWIGUNUSED __attribute__ ((__unused__)) 
# else
#   define SWIGUNUSED 
# endif
#endif

#ifndef SWIG_MSC_UNSUPPRESS_4505
# if defined(_MSC_VER)
#   pragma warning(disable : 4505) /* unreferenced local function has been removed */
# endif 
#endif

#ifndef SWIGUNUSEDPARM
# ifdef __cplusplus
#   define SWIGUNUSEDPARM(p)
# else
#   define SWIGUNUSEDPARM(p) p SWIGUNUSED 
# endif
#endif

/* internal SWIG method */
#ifndef SWIGINTERN
# define SWIGINTERN static SWIGUNUSED
#endif

/* internal inline SWIG method */
#ifndef SWIGINTERNINLINE
# define SWIGINTERNINLINE SWIGINTERN SWIGINLINE
#endif

/* exporting methods */
#if (__GNUC__ >= 4) || (__GNUC__ == 3 && __GNUC_MINOR__ >= 4)
#  ifndef GCC_HASCLASSVISIBILITY
#    define GCC_HASCLASSVISIBILITY
#  endif
#endif

#ifndef SWIGEXPORT
# if defined(_WIN32) || defined(__WIN32__) || defined(__CYGWIN__)
#   if defined(STATIC_LINKED)
#     define SWIGEXPORT
#   else
#     define SWIGEXPORT __declspec(dllexport)
#   endif
# else
#   if defined(__GNUC__) && defined(GCC_HASCLASSVISIBILITY)
#     define SWIGEXPORT __attribute__ ((visibility("default")))
#   else
#     define SWIGEXPORT
#   endif
# endif
#endif

/* calling conventions for Windows */
#ifndef SWIGSTDCALL
# if defined(_WIN32) || defined(__WIN32__) || defined(__CYGWIN__)
#   define SWIGSTDCALL __stdcall
# else
#   define SWIGSTDCALL
# endif 
#endif

/* Deal with Microsoft's attempt at deprecating C standard runtime functions */
#if !defined(SWIG_NO_CRT_SECURE_NO_DEPRECATE) && defined(_MSC_VER) && !defined(_CRT_SECURE_NO_DEPRECATE)
# define _CRT_SECURE_NO_DEPRECATE
#endif

/* Deal with Microsoft's attempt at deprecating methods in the standard C++ library */
#if !defined(SWIG_NO_SCL_SECURE_NO_DEPRECATE) && defined(_MSC_VER) && !defined(_SCL_SECURE_NO_DEPRECATE)
# define _SCL_SECURE_NO_DEPRECATE
#endif



/* Fix for jlong on some versions of gcc on Windows */
#if defined(__GNUC__) && !defined(__INTEL_COMPILER)
  typedef long long __int64;
#endif

/* Fix for jlong on 64-bit x86 Solaris */
#if defined(__x86_64)
# ifdef _LP64
#   undef _LP64
# endif
#endif

#include <jni.h>
#include <stdlib.h>
#include <string.h>


/* Support for throwing Java exceptions */
typedef enum {
  SWIG_JavaOutOfMemoryError = 1, 
  SWIG_JavaIOException, 
  SWIG_JavaRuntimeException, 
  SWIG_JavaIndexOutOfBoundsException,
  SWIG_JavaArithmeticException,
  SWIG_JavaIllegalArgumentException,
  SWIG_JavaNullPointerException,
  SWIG_JavaDirectorPureVirtual,
  SWIG_JavaUnknownError
} SWIG_JavaExceptionCodes;

typedef struct {
  SWIG_JavaExceptionCodes code;
  const char *java_exception;
} SWIG_JavaExceptions_t;


static void SWIGUNUSED SWIG_JavaThrowException(JNIEnv *jenv, SWIG_JavaExceptionCodes code, const char *msg) {
  jclass excep;
  static const SWIG_JavaExceptions_t java_exceptions[] = {
    { SWIG_JavaOutOfMemoryError, "java/lang/OutOfMemoryError" },
    { SWIG_JavaIOException, "java/io/IOException" },
    { SWIG_JavaRuntimeException, "java/lang/RuntimeException" },
    { SWIG_JavaIndexOutOfBoundsException, "java/lang/IndexOutOfBoundsException" },
    { SWIG_JavaArithmeticException, "java/lang/ArithmeticException" },
    { SWIG_JavaIllegalArgumentException, "java/lang/IllegalArgumentException" },
    { SWIG_JavaNullPointerException, "java/lang/NullPointerException" },
    { SWIG_JavaDirectorPureVirtual, "java/lang/RuntimeException" },
    { SWIG_JavaUnknownError,  "java/lang/UnknownError" },
    { (SWIG_JavaExceptionCodes)0,  "java/lang/UnknownError" }
  };
  const SWIG_JavaExceptions_t *except_ptr = java_exceptions;

  while (except_ptr->code != code && except_ptr->code)
    except_ptr++;

  jenv->ExceptionClear();
  excep = jenv->FindClass(except_ptr->java_exception);
  if (excep)
    jenv->ThrowNew(excep, msg);
}


/* Contract support */

#define SWIG_contract_assert(nullreturn, expr, msg) if (!(expr)) {SWIG_JavaThrowException(jenv, SWIG_JavaIllegalArgumentException, msg); return nullreturn; } else


    #include "include/kovan/port.hpp"
    #include "include/kovan/sensor.hpp"


#ifdef __cplusplus
extern "C" {
#endif

SWIGEXPORT jlong JNICALL Java_io_github_linkjvm_jni_motors_linkjvm_1motorJNI_new_1Motor(JNIEnv *jenv, jclass jcls, jlong jarg1) {
  jlong jresult = 0 ;
  port_t *arg1 = 0 ;
  Motor *result = 0 ;
  
  (void)jenv;
  (void)jcls;
  arg1 = *(port_t **)&jarg1;
  if (!arg1) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "port_t const & reference is null");
    return 0;
  } 
  result = (Motor *)new Motor((port_t const &)*arg1);
  *(Motor **)&jresult = result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_io_github_linkjvm_jni_motors_linkjvm_1motorJNI_Motor_1clearPositionCounter(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  Motor *arg1 = (Motor *) 0 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(Motor **)&jarg1; 
  (arg1)->clearPositionCounter();
}


SWIGEXPORT void JNICALL Java_io_github_linkjvm_jni_motors_linkjvm_1motorJNI_Motor_1moveAtVelocity(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jshort jarg2) {
  Motor *arg1 = (Motor *) 0 ;
  short *arg2 = 0 ;
  short temp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(Motor **)&jarg1; 
  temp2 = (short)jarg2; 
  arg2 = &temp2; 
  (arg1)->moveAtVelocity((short const &)*arg2);
}


SWIGEXPORT void JNICALL Java_io_github_linkjvm_jni_motors_linkjvm_1motorJNI_Motor_1moveToPosition(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jshort jarg2, jint jarg3) {
  Motor *arg1 = (Motor *) 0 ;
  short *arg2 = 0 ;
  int *arg3 = 0 ;
  short temp2 ;
  int temp3 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(Motor **)&jarg1; 
  temp2 = (short)jarg2; 
  arg2 = &temp2; 
  temp3 = (int)jarg3; 
  arg3 = &temp3; 
  (arg1)->moveToPosition((short const &)*arg2,(int const &)*arg3);
}


SWIGEXPORT void JNICALL Java_io_github_linkjvm_jni_motors_linkjvm_1motorJNI_Motor_1moveRelativePosition(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jshort jarg2, jint jarg3) {
  Motor *arg1 = (Motor *) 0 ;
  short *arg2 = 0 ;
  int *arg3 = 0 ;
  short temp2 ;
  int temp3 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(Motor **)&jarg1; 
  temp2 = (short)jarg2; 
  arg2 = &temp2; 
  temp3 = (int)jarg3; 
  arg3 = &temp3; 
  (arg1)->moveRelativePosition((short const &)*arg2,(int const &)*arg3);
}


SWIGEXPORT void JNICALL Java_io_github_linkjvm_jni_motors_linkjvm_1motorJNI_Motor_1setPidGains(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jshort jarg2, jshort jarg3, jshort jarg4, jshort jarg5, jshort jarg6, jshort jarg7) {
  Motor *arg1 = (Motor *) 0 ;
  short *arg2 = 0 ;
  short *arg3 = 0 ;
  short *arg4 = 0 ;
  short *arg5 = 0 ;
  short *arg6 = 0 ;
  short *arg7 = 0 ;
  short temp2 ;
  short temp3 ;
  short temp4 ;
  short temp5 ;
  short temp6 ;
  short temp7 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(Motor **)&jarg1; 
  temp2 = (short)jarg2; 
  arg2 = &temp2; 
  temp3 = (short)jarg3; 
  arg3 = &temp3; 
  temp4 = (short)jarg4; 
  arg4 = &temp4; 
  temp5 = (short)jarg5; 
  arg5 = &temp5; 
  temp6 = (short)jarg6; 
  arg6 = &temp6; 
  temp7 = (short)jarg7; 
  arg7 = &temp7; 
  (arg1)->setPidGains((short const &)*arg2,(short const &)*arg3,(short const &)*arg4,(short const &)*arg5,(short const &)*arg6,(short const &)*arg7);
}


SWIGEXPORT void JNICALL Java_io_github_linkjvm_jni_motors_linkjvm_1motorJNI_Motor_1pidGains(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2, jlong jarg3, jlong jarg4, jlong jarg5, jlong jarg6, jlong jarg7) {
  Motor *arg1 = (Motor *) 0 ;
  short *arg2 = 0 ;
  short *arg3 = 0 ;
  short *arg4 = 0 ;
  short *arg5 = 0 ;
  short *arg6 = 0 ;
  short *arg7 = 0 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(Motor **)&jarg1; 
  arg2 = *(short **)&jarg2;
  if (!arg2) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "short & reference is null");
    return ;
  } 
  arg3 = *(short **)&jarg3;
  if (!arg3) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "short & reference is null");
    return ;
  } 
  arg4 = *(short **)&jarg4;
  if (!arg4) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "short & reference is null");
    return ;
  } 
  arg5 = *(short **)&jarg5;
  if (!arg5) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "short & reference is null");
    return ;
  } 
  arg6 = *(short **)&jarg6;
  if (!arg6) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "short & reference is null");
    return ;
  } 
  arg7 = *(short **)&jarg7;
  if (!arg7) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "short & reference is null");
    return ;
  } 
  (arg1)->pidGains(*arg2,*arg3,*arg4,*arg5,*arg6,*arg7);
}


SWIGEXPORT void JNICALL Java_io_github_linkjvm_jni_motors_linkjvm_1motorJNI_Motor_1freeze(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  Motor *arg1 = (Motor *) 0 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(Motor **)&jarg1; 
  (arg1)->freeze();
}


SWIGEXPORT jboolean JNICALL Java_io_github_linkjvm_jni_motors_linkjvm_1motorJNI_Motor_1isMotorDone(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jboolean jresult = 0 ;
  Motor *arg1 = (Motor *) 0 ;
  bool result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(Motor **)&jarg1; 
  result = (bool)((Motor const *)arg1)->isMotorDone();
  jresult = (jboolean)result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_io_github_linkjvm_jni_motors_linkjvm_1motorJNI_Motor_1blockMotorDone(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  Motor *arg1 = (Motor *) 0 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(Motor **)&jarg1; 
  ((Motor const *)arg1)->blockMotorDone();
}


SWIGEXPORT void JNICALL Java_io_github_linkjvm_jni_motors_linkjvm_1motorJNI_Motor_1forward(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  Motor *arg1 = (Motor *) 0 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(Motor **)&jarg1; 
  (arg1)->forward();
}


SWIGEXPORT void JNICALL Java_io_github_linkjvm_jni_motors_linkjvm_1motorJNI_Motor_1backward(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  Motor *arg1 = (Motor *) 0 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(Motor **)&jarg1; 
  (arg1)->backward();
}


SWIGEXPORT void JNICALL Java_io_github_linkjvm_jni_motors_linkjvm_1motorJNI_Motor_1motor(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jint jarg2) {
  Motor *arg1 = (Motor *) 0 ;
  int arg2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(Motor **)&jarg1; 
  arg2 = (int)jarg2; 
  (arg1)->motor(arg2);
}


SWIGEXPORT void JNICALL Java_io_github_linkjvm_jni_motors_linkjvm_1motorJNI_Motor_1off(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  Motor *arg1 = (Motor *) 0 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(Motor **)&jarg1; 
  (arg1)->off();
}


SWIGEXPORT jlong JNICALL Java_io_github_linkjvm_jni_motors_linkjvm_1motorJNI_Motor_1port(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  Motor *arg1 = (Motor *) 0 ;
  port_t *result = 0 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(Motor **)&jarg1; 
  result = (port_t *) &((Motor const *)arg1)->port();
  *(port_t **)&jresult = result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_io_github_linkjvm_jni_motors_linkjvm_1motorJNI_delete_1Motor(JNIEnv *jenv, jclass jcls, jlong jarg1) {
  Motor *arg1 = (Motor *) 0 ;
  
  (void)jenv;
  (void)jcls;
  arg1 = *(Motor **)&jarg1; 
  delete arg1;
}


SWIGEXPORT jlong JNICALL Java_io_github_linkjvm_jni_motors_linkjvm_1motorJNI_new_1BackEMF(JNIEnv *jenv, jclass jcls, jshort jarg1) {
  jlong jresult = 0 ;
  unsigned char *arg1 = 0 ;
  unsigned char temp1 ;
  BackEMF *result = 0 ;
  
  (void)jenv;
  (void)jcls;
  temp1 = (unsigned char)jarg1; 
  arg1 = &temp1; 
  result = (BackEMF *)new BackEMF((unsigned char const &)*arg1);
  *(BackEMF **)&jresult = result; 
  return jresult;
}


SWIGEXPORT jint JNICALL Java_io_github_linkjvm_jni_motors_linkjvm_1motorJNI_BackEMF_1value(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jint jresult = 0 ;
  BackEMF *arg1 = (BackEMF *) 0 ;
  int result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(BackEMF **)&jarg1; 
  result = (int)((BackEMF const *)arg1)->value();
  jresult = (jint)result; 
  return jresult;
}


SWIGEXPORT jshort JNICALL Java_io_github_linkjvm_jni_motors_linkjvm_1motorJNI_BackEMF_1port(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jshort jresult = 0 ;
  BackEMF *arg1 = (BackEMF *) 0 ;
  unsigned char result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(BackEMF **)&jarg1; 
  result = (unsigned char)((BackEMF const *)arg1)->port();
  jresult = (jshort)result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_io_github_linkjvm_jni_motors_linkjvm_1motorJNI_delete_1BackEMF(JNIEnv *jenv, jclass jcls, jlong jarg1) {
  BackEMF *arg1 = (BackEMF *) 0 ;
  
  (void)jenv;
  (void)jcls;
  arg1 = *(BackEMF **)&jarg1; 
  delete arg1;
}


SWIGEXPORT jlong JNICALL Java_io_github_linkjvm_jni_motors_linkjvm_1motorJNI_BackEMF_1SWIGUpcast(JNIEnv *jenv, jclass jcls, jlong jarg1) {
    jlong baseptr = 0;
    (void)jenv;
    (void)jcls;
    *(Sensor< int > **)&baseptr = *(BackEMF **)&jarg1;
    return baseptr;
}

#ifdef __cplusplus
}
#endif

