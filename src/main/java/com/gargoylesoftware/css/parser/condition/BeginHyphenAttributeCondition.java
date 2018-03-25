/*
 * Copyright (c) 2018 Ronald Brill.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gargoylesoftware.css.parser.condition;

import java.io.Serializable;

import com.gargoylesoftware.css.parser.AbstractLocatable;

/**
 * @author Ronald Brill
 */
public class BeginHyphenAttributeCondition extends AbstractLocatable implements Condition, Serializable {

    private final String localName_;
    private final String value_;

    /**
     * Ctor.
     * @param localName the local name
     * @param value the value
     */
    public BeginHyphenAttributeCondition(final String localName, final String value) {
        localName_ = localName;
        value_ = value;
    }

    @Override
    public ConditionType getConditionType() {
        return ConditionType.BEGIN_HYPHEN_ATTRIBUTE_CONDITION;
    }

    /**
     * @return the local name
     */
    public String getLocalName() {
        return localName_;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value_;
    }

    @Override
    public String toString() {
        final String value = getValue();
        if (value != null) {
            return "[" + getLocalName() + "|=\"" + value + "\"]";
        }
        return "[" + getLocalName() + "]";
    }
}

