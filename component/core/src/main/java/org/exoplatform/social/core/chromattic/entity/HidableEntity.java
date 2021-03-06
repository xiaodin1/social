/*
 * Copyright (C) 2003-2013 eXo Platform SAS.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.exoplatform.social.core.chromattic.entity;

import org.chromattic.api.annotations.MixinType;
import org.chromattic.api.annotations.Property;
import org.exoplatform.social.core.storage.query.PropertyLiteralExpression;

@MixinType(name = "soc:hidable")
public abstract class HidableEntity {

  /**
   * Can be hidden or not.
   */
  @Property(name = "soc:isHidden")
  public abstract Boolean getHidden();
  public abstract void setHidden(Boolean isHidden);
  public static final PropertyLiteralExpression<Boolean> isHidden =
      new PropertyLiteralExpression<Boolean>(Boolean.class, "soc:isHidden");
}
