/*
 * Copyright 2021 jrostf2 project
 * 
 * Website: https://github.com/pinorobotics/jros1tf2
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
package pinorobotics.jros1tf2.tf2_msgs;

import id.jros1messages.geometry_msgs.TransformStampedMessage;
import id.jrosmessages.Message;
import id.jrosmessages.MessageMetadata;
import id.xfunction.XJson;
import java.util.Arrays;
import java.util.Objects;

/** Definition for tf2_msgs/TFMessage */
@MessageMetadata(name = TFMessage.NAME, md5sum = "94810edda583a504dfda3829e70d7eec")
public class TFMessage implements Message {

    static final String NAME = "tf2_msgs/TFMessage";

    public TransformStampedMessage[] transforms = new TransformStampedMessage[0];

    public TFMessage withTransforms(TransformStampedMessage... transforms) {
        this.transforms = transforms;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.hashCode(transforms));
    }

    @Override
    public boolean equals(Object obj) {
        var other = (TFMessage) obj;
        return Arrays.equals(transforms, other.transforms);
    }

    @Override
    public String toString() {
        return XJson.asString("transforms", transforms);
    }
}
