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
import java.util.Objects;
import pinorobotics.jrostf2.impl.LookupTransformResult;
import pinorobotics.jrostf2.tf2_msgs.TF2ErrorMessage;

/** Definition for tf2_msgs/LookupTransformResult */
@MessageMetadata(
        name = LookupTransformResultMessage.NAME,
        md5sum = "3fe5db6a19ca9cfb675418c5ad875c36")
public class LookupTransformResultMessage implements Message, LookupTransformResult {

    static final String NAME = "tf2_msgs/LookupTransformResult";

    public TransformStampedMessage transform = new TransformStampedMessage();

    public TF2ErrorMessage error = new TF2ErrorMessage();

    public LookupTransformResultMessage withTransform(TransformStampedMessage transform) {
        this.transform = transform;
        return this;
    }

    public LookupTransformResultMessage withError(TF2ErrorMessage error) {
        this.error = error;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(transform, error);
    }

    @Override
    public boolean equals(Object obj) {
        var other = (LookupTransformResultMessage) obj;
        return Objects.equals(transform, other.transform) && Objects.equals(error, other.error);
    }

    @Override
    public String toString() {
        return XJson.asString(
                "transform", transform,
                "error", error);
    }

    @Override
    public TF2ErrorMessage getError() {
        return error;
    }
}
