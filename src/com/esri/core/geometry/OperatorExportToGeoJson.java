/*
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.

 For additional information, contact:
 Environmental Systems Research Institute, Inc.
 Attn: Contracts Dept
 380 New York Street
 Redlands, California, USA 92373

 email: contracts@esri.com
 */

package com.esri.core.geometry;

import com.esri.core.geometry.Operator.Type;

/**
 *Export to GeoJson format.
 */
public abstract class OperatorExportToGeoJson extends Operator {
    @Override
    public Type getType() {
        return Type.ExportToGeoJson;
    }

    public abstract JsonCursor execute(SpatialReference spatialReference, GeometryCursor geometryCursor);

    public abstract String execute(SpatialReference spatialReference, Geometry geometry);

    public abstract String execute(int exportFlags, SpatialReference spatialReference, Geometry geometry);
	
    public abstract String execute(Geometry geometry);

    public static OperatorExportToGeoJson local() {
        return (OperatorExportToGeoJson) OperatorFactoryLocal.getInstance()
                .getOperator(Type.ExportToGeoJson);
    }
}
