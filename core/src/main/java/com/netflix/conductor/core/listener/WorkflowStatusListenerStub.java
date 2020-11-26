/*
 * Copyright 2020 Netflix, Inc.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.netflix.conductor.core.listener;

import com.netflix.conductor.common.run.Workflow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Stub listener default implementation
 */
public class WorkflowStatusListenerStub implements WorkflowStatusListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(WorkflowStatusListenerStub.class);

    @Override
    public void onWorkflowCompleted(Workflow workflow) {
        LOGGER.debug("Workflow {} is completed", workflow.getWorkflowId());
    }

    @Override
    public void onWorkflowTerminated(Workflow workflow) {
        LOGGER.debug("Workflow {} is terminated", workflow.getWorkflowId());
    }
}
