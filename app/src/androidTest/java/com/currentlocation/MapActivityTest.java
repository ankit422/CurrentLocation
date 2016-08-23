package com.currentlocation;


import android.support.test.filters.SmallTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by ankit on 27/07/16.
 */

@RunWith(AndroidJUnit4.class)
@SmallTest
public class MapActivityTest {
    public static final String TEST_STRING = "This is a string";
    public static final long TEST_LONG = 12345678L;
    private MapsActivity mLogHistory;

    @Before
    public void createLogHistory() {
//        mLogHistory = new MapsActivity();
    }

    @Test
    public void logHistory_ParcelableWriteRead() {
        // Set up the Parcelable object to send and receive.
        Assert.assertNotNull(null);
//        mLogHistory.addEntry(TEST_STRING, TEST_LONG);
//
//        // Write the data.
//        Parcel parcel = Parcel.obtain();
//        mLogHistory.writeToParcel(parcel, mLogHistory.describeContents());
//
//        // After you're done with writing, you need to reset the parcel for reading.
//        parcel.setDataPosition(0);
//
//        // Read the data.
//        LogHistory createdFromParcel = LogHistory.CREATOR.createFromParcel(parcel);
//        List<Pair<String, Long>> createdFromParcelData = createdFromParcel.getData();
//
//        // Verify that the received data is correct.
//        assertThat(createdFromParcelData.size(), is(1));
//        assertThat(createdFromParcelData.get(0).first, is(TEST_STRING));
//        assertThat(createdFromParcelData.get(0).second, is(TEST_LONG));
    }
}
