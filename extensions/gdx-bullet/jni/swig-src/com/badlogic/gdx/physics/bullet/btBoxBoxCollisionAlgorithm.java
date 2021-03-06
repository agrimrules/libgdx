/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btBoxBoxCollisionAlgorithm extends btActivatingCollisionAlgorithm {
	private long swigCPtr;
	
	protected btBoxBoxCollisionAlgorithm(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, gdxBulletJNI.btBoxBoxCollisionAlgorithm_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	protected btBoxBoxCollisionAlgorithm(long cPtr, boolean cMemoryOwn) {
		this("btBoxBoxCollisionAlgorithm", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(gdxBulletJNI.btBoxBoxCollisionAlgorithm_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btBoxBoxCollisionAlgorithm obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btBoxBoxCollisionAlgorithm(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btBoxBoxCollisionAlgorithm(btCollisionAlgorithmConstructionInfo ci) {
    this(gdxBulletJNI.new_btBoxBoxCollisionAlgorithm__SWIG_0(btCollisionAlgorithmConstructionInfo.getCPtr(ci), ci), true);
  }

  public btBoxBoxCollisionAlgorithm(btPersistentManifold mf, btCollisionAlgorithmConstructionInfo ci, btCollisionObjectWrapper body0Wrap, btCollisionObjectWrapper body1Wrap) {
    this(gdxBulletJNI.new_btBoxBoxCollisionAlgorithm__SWIG_1(btPersistentManifold.getCPtr(mf), mf, btCollisionAlgorithmConstructionInfo.getCPtr(ci), ci, btCollisionObjectWrapper.getCPtr(body0Wrap), body0Wrap, btCollisionObjectWrapper.getCPtr(body1Wrap), body1Wrap), true);
  }

}
