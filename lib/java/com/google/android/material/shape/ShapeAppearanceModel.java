/*
 * Copyright 2018 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.material.shape;

import com.google.android.material.internal.Experimental;

/**
 * This class models the edges and corners of a shape, which are used by {@link
 * MaterialShapeDrawable} to generate and render the shape for a view's background.
 */
@Experimental("The shapes API is currently experimental and subject to change")
public class ShapeAppearanceModel {
  private static final CornerTreatment DEFAULT_CORNER_TREATMENT = new RoundedCornerTreatment(0);
  private static final EdgeTreatment DEFAULT_EDGE_TREATMENT = new EdgeTreatment();

  private CornerTreatment topLeftCorner;
  private CornerTreatment topRightCorner;
  private CornerTreatment bottomRightCorner;
  private CornerTreatment bottomLeftCorner;
  private EdgeTreatment topEdge;
  private EdgeTreatment rightEdge;
  private EdgeTreatment bottomEdge;
  private EdgeTreatment leftEdge;

  /** Constructs a default path generator with default edge and corner treatments. */
  public ShapeAppearanceModel() {
    topLeftCorner = DEFAULT_CORNER_TREATMENT;
    topRightCorner = DEFAULT_CORNER_TREATMENT;
    bottomRightCorner = DEFAULT_CORNER_TREATMENT;
    bottomLeftCorner = DEFAULT_CORNER_TREATMENT;
    topEdge = DEFAULT_EDGE_TREATMENT;
    rightEdge = DEFAULT_EDGE_TREATMENT;
    bottomEdge = DEFAULT_EDGE_TREATMENT;
    leftEdge = DEFAULT_EDGE_TREATMENT;
  }

  /**
   * Sets all corner treatments.
   *
   * @param cornerTreatment the corner treatment to use in all four corners.
   */
  public void setAllCorners(CornerTreatment cornerTreatment) {
    topLeftCorner = cornerTreatment;
    topRightCorner = cornerTreatment;
    bottomRightCorner = cornerTreatment;
    bottomLeftCorner = cornerTreatment;
  }

  /**
   * Sets all edge treatments.
   *
   * @param edgeTreatment the edge treatment to use for all four edges.
   */
  public void setAllEdges(EdgeTreatment edgeTreatment) {
    leftEdge = edgeTreatment;
    topEdge = edgeTreatment;
    rightEdge = edgeTreatment;
    bottomEdge = edgeTreatment;
  }

  /**
   * Sets corner treatments.
   *
   * @param topLeftCorner the corner treatment to use in the top-left corner.
   * @param topRightCorner the corner treatment to use in the top-right corner.
   * @param bottomRightCorner the corner treatment to use in the bottom-right corner.
   * @param bottomLeftCorner the corner treatment to use in the bottom-left corner.
   */
  public void setCornerTreatments(
      CornerTreatment topLeftCorner,
      CornerTreatment topRightCorner,
      CornerTreatment bottomRightCorner,
      CornerTreatment bottomLeftCorner) {
    this.topLeftCorner = topLeftCorner;
    this.topRightCorner = topRightCorner;
    this.bottomRightCorner = bottomRightCorner;
    this.bottomLeftCorner = bottomLeftCorner;
  }

  /**
   * Sets edge treatments.
   *
   * @param leftEdge the edge treatment to use on the left edge.
   * @param topEdge the edge treatment to use on the top edge.
   * @param rightEdge the edge treatment to use on the right edge.
   * @param bottomEdge the edge treatment to use on the bottom edge.
   */
  public void setEdgeTreatments(
      EdgeTreatment leftEdge,
      EdgeTreatment topEdge,
      EdgeTreatment rightEdge,
      EdgeTreatment bottomEdge) {
    this.leftEdge = leftEdge;
    this.topEdge = topEdge;
    this.rightEdge = rightEdge;
    this.bottomEdge = bottomEdge;
  }

  /**
   * Sets the corner treatment for the top-left corner.
   *
   * @param topLeftCorner the desired treatment.
   */
  public void setTopLeftCorner(CornerTreatment topLeftCorner) {
    this.topLeftCorner = topLeftCorner;
  }

  /**
   * Gets the corner treatment for the top-left corner.
   *
   * @return the corner treatment for the top-left corner.
   */
  public CornerTreatment getTopLeftCorner() {
    return topLeftCorner;
  }

  /**
   * Sets the corner treatment for the top-right corner.
   *
   * @param topRightCorner the desired treatment.
   */
  public void setTopRightCorner(CornerTreatment topRightCorner) {
    this.topRightCorner = topRightCorner;
  }

  /**
   * Gets the corner treatment for the top-right corner.
   *
   * @return the corner treatment for the top-right corner.
   */
  public CornerTreatment getTopRightCorner() {
    return topRightCorner;
  }

  /**
   * Sets the corner treatment for the bottom-right corner.
   *
   * @param bottomRightCorner the desired treatment.
   */
  public void setBottomRightCorner(CornerTreatment bottomRightCorner) {
    this.bottomRightCorner = bottomRightCorner;
  }

  /**
   * Gets the corner treatment for the bottom-right corner.
   *
   * @return the corner treatment for the bottom-right corner.
   */
  public CornerTreatment getBottomRightCorner() {
    return bottomRightCorner;
  }

  /**
   * Sets the corner treatment for the bottom-left corner.
   *
   * @param bottomLeftCorner the desired treatment.
   */
  public void setBottomLeftCorner(CornerTreatment bottomLeftCorner) {
    this.bottomLeftCorner = bottomLeftCorner;
  }

  /**
   * Gets the corner treatment for the bottom-left corner.
   *
   * @return the corner treatment for the bottom-left corner.
   */
  public CornerTreatment getBottomLeftCorner() {
    return bottomLeftCorner;
  }

  /**
   * Sets the edge treatment for the top edge.
   *
   * @param topEdge the desired treatment.
   */
  public void setTopEdge(EdgeTreatment topEdge) {
    this.topEdge = topEdge;
  }

  /**
   * Gets the edge treatment for the top edge.
   *
   * @return the edge treatment for the top edge.
   */
  public EdgeTreatment getTopEdge() {
    return topEdge;
  }

  /**
   * Sets the edge treatment for the right edge.
   *
   * @param rightEdge the desired treatment.
   */
  public void setRightEdge(EdgeTreatment rightEdge) {
    this.rightEdge = rightEdge;
  }

  /**
   * Gets the edge treatment for the right edge.
   *
   * @return the edge treatment for the right edge.
   */
  public EdgeTreatment getRightEdge() {
    return rightEdge;
  }

  /**
   * Sets the edge treatment for the bottom edge.
   *
   * @param bottomEdge the desired treatment.
   */
  public void setBottomEdge(EdgeTreatment bottomEdge) {
    this.bottomEdge = bottomEdge;
  }

  /**
   * Gets the edge treatment for the bottom edge.
   *
   * @return the edge treatment for the bottom edge.
   */
  public EdgeTreatment getBottomEdge() {
    return bottomEdge;
  }

  /**
   * Sets the edge treatment for the left edge.
   *
   * @param leftEdge the desired treatment.
   */
  public void setLeftEdge(EdgeTreatment leftEdge) {
    this.leftEdge = leftEdge;
  }

  /**
   * Gets the edge treatment for the left edge.
   *
   * @return the edge treatment for the left edge.
   */
  public EdgeTreatment getLeftEdge() {
    return leftEdge;
  }
}
