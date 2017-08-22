/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2017 Chris Magnussen and Elior Boukhobza
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 *
 */

package com.chrisrm.idea.themes;

import com.chrisrm.idea.MTTheme;
import com.chrisrm.idea.MTThemes;

public final class MTDefaultTheme extends MTTheme implements LafTheme {
  public static final String BACKGROUND = "263238"; // 38, 50, 56
  public static final String FOREGROUND = "B0BEC5"; // 176, 190, 197
  public static final String CARET = "FFCC00"; // 255, 204, 0
  public static final String BORDER = "222D33"; // 34, 45, 51
  public static final String TEXT = "607D8B"; // 96, 125, 139
  public static final String SELECTION_BACKGROUND = "546E7A"; // 84, 110, 122
  public static final String SELECTION_FOREGROUND = "FFFFFF";
  public static final String LABEL = "B0BEC5"; // 176, 190, 197
  public static final String SUB_LABEL = "546E7A"; // 84, 110, 122
  public static final String DISABLED = "2E3C43"; // 65, 89, 103
  public static final String SIDEBAR_HEADING = "CFD8DC"; // 207, 216, 220
  public static final String STATUS_LABEL = "78909C"; // 120, 144, 156
  public static final String INPUT_BORDER = "37474F"; //55, 71, 79
  public static final String BUTTON_BACKGROUND = "2C3C41"; // 44, 60, 65
  public static final String BUTTON_FOREGROUND = "607D8B"; // 96, 125, 139
  public static final String BUTTON_SELECTED = "314549"; // 49, 69, 73
  public static final String ACCENT_COLOR = "80CBC4"; // 128, 203, 196

  public MTDefaultTheme() {
    super("mt.default", "Material Theme - Default", true, MTThemes.DEFAULT);
  }

  @Override
  public String getDisabled() {
    return DISABLED;
  }

  @Override
  protected String getTreeSelectionColorString() {
    return "546E7A50";
  }

  @Override
  protected String getButtonHighlightColorString() {
    return "304146";
  }

  @Override
  protected String getHighlightColor() {
    return "425B67";
  }

  @Override
  protected String getSecondBorderColorString() {
    return "2A373E";
  }

  @Override
  protected String getTableSelectedColorString() {
    return "314549";
  }

  @Override
  protected String getContrastColorString() {
    return "1E272C";
  }

  @Override
  protected String getDisabledColorString() {
    return "415967";
  }

  @Override
  protected String getSecondaryBackgroundColorString() {
    return "32424A";
  }

  @Override
  protected String getCaretColorString() {
    return "FFCC00";
  }

  @Override
  protected String getInactiveColorString() {
    return "2E3C43";
  }

  @Override
  protected String getSelectionForegroundColorString() {
    return "FFFFFF";
  }

  @Override
  protected String getSelectionBackgroundColorString() {
    return "546E7A";
  }

  @Override
  protected String getTextColorString() {
    return "607D8B";
  }

  @Override
  protected String getForegroundColorString() {
    return "B0BEC5";
  }

  @Override
  protected String getBackgroundColorString() {
    return "263238";
  }

}
