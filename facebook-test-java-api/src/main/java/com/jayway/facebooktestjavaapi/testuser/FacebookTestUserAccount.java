package com.jayway.facebooktestjavaapi.testuser;

/**
 * API for a Facebook test user, encapsulating the ID, Access token and the Login URL for the user.
 * <p/>
 * This API also provides access to JSON string representation of connections to user objects
 * described in the <a href="http://developers.facebook.com/docs/api">Facebook Graph API</a>
 * documentation, which is essentially resources accessible using the
 * <code>https://graph.facebook.com/ID/CONNECTION_TYPE</code> syntax.
 */
public interface FacebookTestUserAccount {

    /**
     * Deletes this test user in Facebook.
     */
    void delete();

    /**
     * Creates a friend relationship between this test user and the one in the parameter.
     *
     * @param friend A Facebook test user account.
     */
    void makeFriends(FacebookTestUserAccount friend);

    /**
     * @return A JSON string array of /me/friends
     */
    String getFriends();

    /**
     * @return The JSON string array of /ID/feed
     */
    String getProfileFeed();

    /**
     * @return The JSON string array of /ID/home
     */
    String getNewsFeed();

    /**
     * @return The JSON string array of /ID/likes
     */
    String getLikes();

    /**
     * @return The JSON string array of /ID/movies
     */
    String getMovies();

    /**
     * @return The JSON string array of /ID/music
     */
    String getMusic();

    /**
     * @return The JSON string array of /ID/books
     */
    String getBooks();

    /**
     * @return The JSON string array of /ID/notes
     */
    String getNotes();

    /**
     * @return The JSON string array of /ID/photos
     */
    String getPhotoTags();

    /**
     * @return The JSON string array of /ID/albums
     */
    String getPhotoAlbums();

    /**
     * @return The JSON string array of /ID/videos
     */
    String getVideoTags();

    /**
     * @return The JSON string array of /ID/videos/uploaded
     */
    String getVideoUploads();

    /**
     * @return The JSON string array of /ID/events
     */
    String getEvents();

    /**
     * @return The JSON string array of /ID/groups
     */
    String getGroups();

    /**
     * @return The JSON string array of /ID/checkins
     */
    String getCheckins();

    /**
     * @return A JSON string containing user details for this test user (/me)
     */
    String getUserDetails();

    /**
     * @return The Facebook ID for this test user
     */
    String id();

    /**
     * @return The access token for this test user.
     */
    String accessToken();

    /**
     * The login URL gives access to the Facebook page for this test user.
     * <p/>
     * The <a href="http://developers.facebook.com/docs/test_users">Facebook documentation</a>
     * states that the URL expires after first use or after 10 minutes, whichever comes first.
     *
     * @return The login URL for this test user.
     */
    String loginUrl();

    /**
     * @return The JSON string representation of the id, access token and login URL.
     */
    String json();
}
