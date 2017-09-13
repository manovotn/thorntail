/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wildfly.swarm.microprofile_metrics.runtime.exporters;

import org.eclipse.microprofile.metrics.MetricUnits;

/**
 * @author hrupp
 */
public class PrometheusUnit {





  public static String getBaseUnitAsPrometheusString(String unit) {

    String out;
    switch (unit) {

      /* Represents bits. Not defined by SI, but by IEC 60027 */
      case MetricUnits.BITS:
      /* 1000 {@link #BITS} */
      case MetricUnits.KILOBITS:
      /* 1000 {@link #KIBIBITS} */
      case MetricUnits.MEGABITS:
      /* 1000 {@link #MEGABITS} */
      case MetricUnits.GIGABITS:
      /* 1024 {@link #BITS} */
      case MetricUnits.KIBIBITS:
      /* 1024 {@link #KIBIBITS}  */
      case MetricUnits.MEBIBITS:
      /* 1024 {@link #MEBIBITS} */
      case MetricUnits.GIBIBITS:
      /* 8 {@link #BITS} */
      case MetricUnits.BYTES:
      /* 1000 {@link #BYTES} */
      case MetricUnits.KILOBYTES:
      /* 1000 {@link #KILOBYTES} */
      case MetricUnits.MEGABYTES:
      /* 1000 {@link #MEGABYTES} */
      case MetricUnits.GIGABYTES:
        out = "bytes";
        break;

      /* 1/1000 {@link #MICROSECONDS} */
      case MetricUnits.NANOSECONDS:
      /* 1/1000 {@link #MILLISECONDS} */
      case MetricUnits.MICROSECONDS:
      /* 1/1000 {@link #SECONDS} */
      case MetricUnits.MILLISECONDS:
      /* Represents seconds */
      case MetricUnits.SECONDS:
      /* 60 {@link #SECONDS} */
      case MetricUnits.MINUTES:
      /* 60 {@link #MINUTES} */
      case MetricUnits.HOURS:
      /* 24 {@link #HOURS} */
      case MetricUnits.DAYS:
        out = "seconds";
        break;
      default:
        out = unit;
    }
    return out;
  }
}
