/*
 * Copyright 2011 the original author or authors.
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
package org.openehealth.ipf.modules.cda;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.Diagnostic;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil.ValidationHandler;

/**
 * Validation Handler
 * @author Stefan Ivanov
 *
 */
public class DefaultValidationHandler implements ValidationHandler {
    private static final Log LOG = LogFactory.getLog(DefaultValidationHandler.class.getName());
    
    @Override
    public void handleError(Diagnostic diagnostic) {
        if (LOG.isErrorEnabled()){
            LOG.error("Validation error:" + diagnostic);
        }
        
    }
    
    @Override
    public void handleWarning(Diagnostic diagnostic) {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    public void handleInfo(Diagnostic diagnostic) {
        // TODO Auto-generated method stub
        
    }
    
}
