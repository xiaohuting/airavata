/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package org.apache.airavata.core.gfac.context.invocation;

import org.apache.airavata.core.gfac.context.message.MessageContext;
import org.apache.airavata.core.gfac.context.security.SecurityContext;

/**
 * InvocationContext is the main context contains other contexts. It is used (per invocation) as
 * a parameter to pass to all modules in the Gfac service.
 * 
 */
public interface InvocationContext {  
    
    /**
     * Get ServiceName for the invocation
     * 
     * @return
     */
    public String getServiceName();
    
    /**
     * Get input. Use to handle specific MessageContext for input
     * 
     * @return MessageContext contains input
     */
    public <T> MessageContext<T> getInput();

    /**
     * Set MessageContext as input
     * 
     * @param value
     */
    public void setInput(MessageContext<?> value);

    /**
     * Get output. Use to handle specific MessageContext for output
     * 
     * @return MessageContext contains output
     */
    public <T> MessageContext<T> getOutput();

    /**
     * Set MessageContext as output
     * 
     * @param value
     */    
    public void setOutput(MessageContext<?> value);
    
    /**
     * Get ExecutionDescription
     * 
     * @return ExecutionDescription
     */
    public ExecutionDescription getExecutionDescription();
        

    /**
     * Set ExecutionDescription
     * 
     * @param value
     */
    public void setExecutionDescription(ExecutionDescription value);

    /**
     * Get ExecutionContext
     * 
     * @return ExecutionContext
     */
    public ExecutionContext getExecutionContext();

    /**
     * Set ExecutionContext
     * 
     * @param value
     */
    public void setExecutionContext(ExecutionContext value);

    /**
     * Get MessageContext
     * 
     * @param name
     * @return MessageContext
     */
    public <T> MessageContext<T> getMessageContext(String name);

    /**
     * Add MessageContext to the invocation with specific name.
     * 
     * @param name
     * @param value
     */
    public void addMessageContext(String name, MessageContext<?> value);

    /**
     * Get SecurityContext
     * 
     * @param name
     * @return
     */
    public SecurityContext getSecurityContext(String name);
    
    /**
     * Add SecurityContext to the invocation with specific name.
     * 
     * @param name
     * @param value
     */
    public void addSecurityContext(String name, SecurityContext value);

}
