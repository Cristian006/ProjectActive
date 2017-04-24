package ponce.cristian.fit.core.social;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Cristian Ponce on 4/23/2017.
 */

//@IgnoreExtraProperties
public class Post {
    public String uid;
    public String author;
    public String title;
    public String body;
    public int dopeCount = 0;
    public Map<String, Boolean> dopes = new HashMap<>();

    public Post(){

    }

    public Post(String uid, String author, String title, String body){
        this.uid = uid;
        this.author = author;
        this.title = title;
        this.body = body;
    }

    //@Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("uid", uid);
        result.put("author", author);
        result.put("title", title);
        result.put("body", body);
        result.put("starCount", dopeCount);
        result.put("stars", dopes);

        return result;
    }
/*
    public void onLikeClicked(DatabaseReference postRef){
        postRef.runTransaction(new Transaction.Handler() {
            @Override
            public Transaction.Result doTransaction(MutableData mutableData) {
                Post p = mutableData.getValue(Post.class);
                if (p == null) {
                    return Transaction.success(mutableData);
                }

                if (p.stars.containsKey(getUid())) {
                    // Unstar the post and remove self from stars
                    p.starCount = p.starCount - 1;
                    p.stars.remove(getUid());
                } else {
                    // Star the post and add self to stars
                    p.starCount = p.starCount + 1;
                    p.stars.put(getUid(), true);
                }

                // Set value and report transaction success
                mutableData.setValue(p);
                return Transaction.success(mutableData);
            }

            @Override
            public void onComplete(DatabaseError databaseError, boolean b,
                                   DataSnapshot dataSnapshot) {
                // Transaction completed
                Log.d(TAG, "postTransaction:onComplete:" + databaseError);
            }
        });
    }
    */
}
