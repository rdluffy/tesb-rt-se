/*
 * #%L
 * Talend :: ESB :: Job :: API
 * %%
 * Copyright (C) 2011 Talend Inc.
 * %%
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
 * #L%
 */
package routines;

/**
 * Interface describing Job behaviors.
 */
public interface TalendJob {

    /**
     * Run a Talend job.
     *
     * @param args job arguments.
     * @return an array of value per row returned.
     */
    public String[][] runJob(String[] args);

    /**
     * Run a Talend job.
     *
     * @param args job arguments.
     * @return return code, if 0 execution completed successfully, else execution failed.
     */
    public int runJobInTOS(String[] args);

}
