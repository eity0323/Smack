/**
 *
 * Copyright 2018-2019 Florian Schmaus
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
package org.jivesoftware.smack.provider;

import org.jivesoftware.smack.packet.TlsProceed;

import org.xmlpull.v1.XmlPullParser;

public final class TlsFailureProvider extends NonzaProvider<TlsProceed> {

    public static final TlsFailureProvider INSTANCE = new TlsFailureProvider();

    private TlsFailureProvider() {
    }

    @Override
    public TlsProceed parse(XmlPullParser parser, int initialDepth) {
        return TlsProceed.INSTANCE;
    }

}