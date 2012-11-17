/*
 * Copyright 2012, pline.co.jp
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

package jp.co.pline.android.ctrlkeyboard;

import android.os.Bundle;
import android.content.Context;
import android.preference.PreferenceManager;

public class Settings extends android.preference.PreferenceActivity{
    public static final String KEY_ASSIGNKEY4CHARS="assignkey4chars";
    public static boolean isAssignKey4Chars(Context context,boolean defaultValue){
	return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(KEY_ASSIGNKEY4CHARS,defaultValue);
    }
    public static boolean isAssignKey4Chars(Context context){
	return isAssignKey4Chars(context,false);
    }
    public static void setAssignKey4Chars(Context context,boolean value){
	PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(KEY_ASSIGNKEY4CHARS,value).commit();
    }

    /** Called when the activity is first created. */
    @SuppressWarnings("deprecation")
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
	addPreferencesFromResource(R.xml.preference);
    }
}
