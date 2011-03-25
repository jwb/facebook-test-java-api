package com.jayway.facebooktestjavaapi.testuser;

import java.util.List;

/**
 * Provides access to Facebook test users for an application.
 * <p/>
 */
public interface FacebookTestUserStore {
    /**
     * Creates a new Facebook test user for a Facebook application.
     *
     * @param appInstalled True if the account should directly accept the application requesting the specified permissions,
     *                     false to use the {@link com.jayway.facebooktestjavaapi.testuser.FacebookTestUserAccount#loginUrl()}}.
     * @param permissions  Comma-separated list of permissions for the Facebook application. See
     *                     <a href="http://developers.facebook.com/docs/authentication/permissions">Permissions</a>
     *                     documentation.
     * @return The created Facebook test users, if successful.
     */
    FacebookTestUserAccount createTestUser(boolean appInstalled, String permissions);

    /**
     * Queries Facebook about all registered test users for a Facebook application.
     *
     * @return A list of Facebook test users.
     */
    List<FacebookTestUserAccount> getAllTestUsers();

    /**
     * Delete all test users registered for a Facebook application.
     */
    void deleteAllTestUsers();

    /**
     *  @return The application ID for the facebook test user store.
     */
    String getApplicationId();

    /**
     * @return The access token for the application.
     */
    String getAccessToken();
}
