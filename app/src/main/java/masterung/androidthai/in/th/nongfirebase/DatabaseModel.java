package masterung.androidthai.in.th.nongfirebase;

import android.os.Parcel;
import android.os.Parcelable;

public class DatabaseModel implements Parcelable{

    private String dataString, messageString;

    public DatabaseModel() {
    }   // Constructor Getter

    public DatabaseModel(String dataString,
                         String messageString) {
        this.dataString = dataString;
        this.messageString = messageString;
    }   // Constructor Setter

    protected DatabaseModel(Parcel in) {
        dataString = in.readString();
        messageString = in.readString();
    }

    public static final Creator<DatabaseModel> CREATOR = new Creator<DatabaseModel>() {
        @Override
        public DatabaseModel createFromParcel(Parcel in) {
            return new DatabaseModel(in);
        }

        @Override
        public DatabaseModel[] newArray(int size) {
            return new DatabaseModel[size];
        }
    };

    public String getDataString() {
        return dataString;
    }

    public void setDataString(String dataString) {
        this.dataString = dataString;
    }

    public String getMessageString() {
        return messageString;
    }

    public void setMessageString(String messageString) {
        this.messageString = messageString;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(dataString);
        dest.writeString(messageString);
    }
}
