package com.gpintus.primefacesmaven;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.model.UploadedFile;
//import twitter4j.JSONException;
//import twitter4j.StatusUpdate;
//import twitter4j.Twitter;
//import twitter4j.TwitterException;
//import twitter4j.TwitterFactory;
//import twitter4j.conf.ConfigurationBuilder;

@ManagedBean
public class FileUploadView {

    private UploadedFile file;
    private String tweetMessage;

    public void upload() {
        String now = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());
        String completeTweet = "Message date:" + now + " Message content: " + tweetMessage;
//        ConfigurationBuilder cb = new ConfigurationBuilder();
//        cb.setDebugEnabled(true)
//                .setOAuthConsumerKey("PzyTbRjePQqGc3V7xcPxH8VvO")
//                .setOAuthConsumerSecret("tQUfRCrMTuaAxmQnBmyLFKprYJqi981cs1JRkgBOdsOM4QZuAp")
//                .setOAuthAccessToken("3985920261-QKvKRwxLtfl7Rm1iM6DXBJL0y7cD7egSsoGlVsm")
//                .setOAuthAccessTokenSecret("Pah10UT2dmRxaOnBPnn93k418zulWe4dLDzqaLVCcETuB");
//        TwitterFactory tf = new TwitterFactory(cb.build());
//        Twitter twitter = tf.getInstance();
//        twitter.getOAuthAccessToken();
//        
//        if (file != null && file.getFileName() != null && file.getFileName().length() > 0) {
//            File f = new File(file.getFileName());
//
//            if (f.exists() && f.isFile()) {
//                String mediaId;
//                if (f.getName().endsWith(".mp4")) {
//                    mediaId = twitter.uploadMediaChunked(f);
//                } else {
//                    mediaId = String.valueOf(twitter.uploadMedia(f).getMediaId());
//                }
//
//                StatusUpdate su = new StatusUpdate(completeTweet);
//                long[] l = new long[1];
//                l[0] = Long.valueOf(mediaId);
//                su.setMediaIds(l);
//                twitter.updateStatus(su);
//            }
//
//        } else {
//            twitter.updateStatus(completeTweet);
//            
//        }
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Success", "I've posted this message <"+completeTweet+">");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }

    public String getTweetMessage() {
        return tweetMessage;
    }

    public void setTweetMessage(String tweetMessage) {
        this.tweetMessage = tweetMessage;
    }
}
