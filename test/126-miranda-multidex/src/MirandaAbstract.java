/*
 * Copyright (C) 2006 The Android Open Source Project
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

/**
 * Miranda testing.
 */
public abstract class MirandaAbstract implements MirandaInterface, MirandaInterface2
{
    protected MirandaAbstract() { }

    // These will be miranda methods, as the interfaces define them, but they are not
    // implemented in this abstract class:
    //public abstract boolean inInterface();
    //public abstract int inInterface2();

    public boolean inAbstract() {
        return true;
    }

    public void callMiranda() {
        System.out.println(inInterface() + " " + inInterface2());
    }
}
