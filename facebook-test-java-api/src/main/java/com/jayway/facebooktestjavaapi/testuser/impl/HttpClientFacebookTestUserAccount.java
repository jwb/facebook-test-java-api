package com.jayway.facebooktestjavaapi.testuser.impl;

import com.jayway.facebooktestjavaapi.testuser.FacebookTestUserAccount;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A FacebookTestUserAccount implementation that relies on HttpClientFacebookTestUserStore.
 */
public class HttpClientFacebookTestUserAccount implements FacebookTestUserAccount {

    private static final Logger log = LoggerFactory.getLogger(HttpClientFacebookTestUserAccount.class);

    private final HttpClientFacebookTestUserStore helper;
    private JSONObject jsonUser;

    public HttpClientFacebookTestUserAccount(HttpClientFacebookTestUserStore helper, JSONObject user) {
        this.helper = helper;
        this.jsonUser = user;
    }

    @Override
    public void delete() {
        String result = helper.delete("/%s", id());
        log.debug("Deleted account [{}]: [{}]", id(), result);
    }
    @Override
    public void makeFriends(FacebookTestUserAccount friend) {
        String requestResult = helper.post("/%s/friends/%s", null, helper.buildList("access_token", accessToken()), id(), friend.id());
        log.debug("Creating friend request: " + requestResult);
        String acceptResult = helper.post("/%s/friends/%s", null, helper.buildList("access_token", friend.accessToken()), friend.id(), id());
        log.debug("Accepting friend request: " + acceptResult);
    }

    @Override
    public String getFriends() {
        return get("/%s/friends", id());
    }

    @Override
    public String getProfileFeed() {
        return get("/%s/feed", id());
    }

    @Override
    public String getNewsFeed() {
        return get("/%s/home", id());
    }

    @Override
    public String getLikes() {
        return get("/%s/likes", id());
    }

    @Override
    public String getMovies() {
        return get("/%s/movies", id());

    }

    @Override
    public String getMusic() {
        return get("/%s/music", id());
    }

    @Override
    public String getBooks() {
        return get("/%s/books", id());
    }

    @Override
    public String getNotes() {
        return get("/%s/notes", id());
    }

    @Override
    public String getPhotoTags() {
        return get("/%s/photos", id());
    }

    @Override
    public String getPhotoAlbums() {
        return get("/%s/albums", id());
    }

    @Override
    public String getVideoTags() {
        return get("/%s/videos", id());
    }

    @Override
    public String getVideoUploads() {
        return get("/%s/videos/uploaded", id());
    }

    @Override
    public String getEvents() {
        return get("/%s/events", id());
    }

    @Override
    public String getGroups() {
        return get("/%s/groups", id());
    }

    @Override
    public String getCheckins() {
        return get("/%s/checkins", id());
    }

    @Override
    public String getUserDetails() {
        return get("%s", id());
    }

    @Override
    public String id() {
        return jsonUser.get("id").toString();
    }

    @Override
    public String accessToken() {
        return jsonUser.get("access_token").toString();
    }

    @Override
    public String loginUrl() {
        return jsonUser.get("login_url").toString();
    }

    @Override
    public String json() {
        return jsonUser.toJSONString();
    }

    private String get(String resource, Object... pathParams) {
        return helper.get(resource, helper.buildList("access_token", accessToken()), pathParams);
    }

}
