/*
 * Copyright 2015 Skymind,Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either cosress or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.nd4j.linalg.api.ops.impl.transforms;

import org.apache.commons.math3.util.FastMath;
import org.nd4j.linalg.api.complex.IComplexNumber;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.api.ops.BaseTransformOp;
import org.nd4j.linalg.api.ops.Op;
import org.nd4j.linalg.api.ops.TransformOp;
import org.nd4j.linalg.util.ComplexUtil;

/**
 * Cosine elementwise function
 * @author Adam Gibson
 */
public class Cos extends BaseTransformOp {

    public Cos(INDArray x, INDArray z) {
        super(x, z);
    }

    public Cos(INDArray x, INDArray z, int n) {
        super(x, z, n);
    }

    public Cos(INDArray x, INDArray y, INDArray z, int n) {
        super(x, y, z, n);
    }

    public Cos(INDArray x) {
        super(x);
    }

    @Override
    public String name() {
        return "cos";
    }

    @Override
    public IComplexNumber op(IComplexNumber origin, double other, Object[] extraArgs) {
        return ComplexUtil.cos(origin);
    }

    @Override
    public IComplexNumber op(IComplexNumber origin, float other, Object[] extraArgs) {
        return ComplexUtil.cos(origin);
    }

    @Override
    public IComplexNumber op(IComplexNumber origin, IComplexNumber other, Object[] extraArgs) {
        return ComplexUtil.cos(origin);
    }

    @Override
    public float op(float origin, float other, Object[] extraArgs) {
        return (float) FastMath.cos(origin);
    }

    @Override
    public double op(double origin, double other, Object[] extraArgs) {
        return FastMath.cos(origin);
    }

    @Override
    public double op(double origin, Object[] extraArgs) {
        return FastMath.cos(origin);
    }

    @Override
    public float op(float origin, Object[] extraArgs) {
        return (float) FastMath.cos(origin);
    }

    @Override
    public IComplexNumber op(IComplexNumber origin, Object[] extraArgs) {
        return ComplexUtil.cos(origin);
    }

    @Override
    public Op opForDimension(int index,int dimension) {
        if(y() != null)
            return new Cos(x.vectorAlongDimension(index,dimension),y.vectorAlongDimension(index,dimension),z.vectorAlongDimension(index,dimension),x.length());
        else
            return new Cos(x.vectorAlongDimension(index,dimension),z.vectorAlongDimension(index,dimension),x.length());

    }



}