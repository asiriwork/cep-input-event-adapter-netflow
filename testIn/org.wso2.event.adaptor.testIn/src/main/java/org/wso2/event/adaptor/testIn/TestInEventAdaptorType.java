/*
 * Copyright 2004,2005 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.event.adaptor.testIn;

import org.apache.axis2.engine.AxisConfiguration;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.event.input.adaptor.core.AbstractInputEventAdaptor;
import org.wso2.carbon.event.input.adaptor.core.InputEventAdaptorListener;
import org.wso2.carbon.event.input.adaptor.core.Property;
import org.wso2.carbon.event.input.adaptor.core.config.InputEventAdaptorConfiguration;
import org.wso2.carbon.event.input.adaptor.core.message.config.InputEventAdaptorMessageConfiguration;
import org.wso2.event.adaptor.testIn.internal.util.TestInEventAdaptorConstants;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;


public final class TestInEventAdaptorType extends AbstractInputEventAdaptor {

    private static final Log log = LogFactory.getLog(TestInEventAdaptorType.class);
    private ResourceBundle resourceBundle;

    @Override
    protected String getName() {
        return TestInEventAdaptorConstants.EVENT_ADAPTOR_TYPE_TESTIN;
    }

    @Override
    protected List<String> getSupportedInputMessageTypes() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    protected void init() {
        this.resourceBundle = ResourceBundle.getBundle("org.wso2.event.adaptor.testIn.i18n.Resources", Locale.getDefault());
    }

    @Override
    protected List<Property> getInputAdaptorProperties() {

        List<Property> propertyList = new ArrayList<Property>();

        Property property1 = new Property(TestInEventAdaptorConstants.EVENT_ADAPTOR_CONF_FIELD1);
        property1.setDisplayName(
                resourceBundle.getString(TestInEventAdaptorConstants.EVENT_ADAPTOR_CONF_FIELD1));
        property1.setRequired(true);
        property1.setHint(resourceBundle.getString(TestInEventAdaptorConstants.EVENT_ADAPTOR_CONF_FIELD1_HINT));
        propertyList.add(property1);

        return propertyList;
    }

    @Override
    protected List<Property> getInputMessageProperties() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String subscribe(
            InputEventAdaptorMessageConfiguration inputEventAdaptorMessageConfiguration,
            InputEventAdaptorListener inputEventAdaptorListener,
            InputEventAdaptorConfiguration inputEventAdaptorConfiguration,
            AxisConfiguration axisConfiguration) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void unsubscribe(
            InputEventAdaptorMessageConfiguration inputEventAdaptorMessageConfiguration,
            InputEventAdaptorConfiguration inputEventAdaptorConfiguration,
            AxisConfiguration axisConfiguration, String s) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

}
