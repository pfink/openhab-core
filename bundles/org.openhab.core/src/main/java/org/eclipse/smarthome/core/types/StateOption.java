/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.smarthome.core.types;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;

/**
 * Describes one possible value an item might have.
 *
 * @author Dennis Nobel - Initial contribution
 */
@NonNullByDefault
public final class StateOption {

    private String value;
    private @Nullable String label;

    /**
     * Creates a {@link StateOption} object.
     *
     * @param value the value of the item
     * @param label label
     */
    public StateOption(String value, @Nullable String label) {
        this.value = value;
        this.label = label;
    }

    /**
     * Returns the label.
     *
     * @return label
     */
    public @Nullable String getLabel() {
        return label;
    }

    /**
     * Returns the value.
     *
     * @return value
     */
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "StateOption [value=" + value + ", label=" + label + "]";
    }
}
