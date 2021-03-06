/*
 * MIT License
 *
 * Copyright (c) 2017-2018 Frederik Ar. Mikkelsen
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package fredboat.db.transfer;

/**
 * Created by napster on 20.03.18.
 * <p>
 * Transfer object for the {@link fredboat.db.entity.main.GuildConfig}
 */
//todo move ""business"" logic to the backend
public class GuildConfig implements TransferObject<String> {

    private String guildId = "";
    private boolean trackAnnounce = false;
    private boolean autoResume = false;
    private String lang = "en_US";

    @Override
    public void setId(String id) {
        this.guildId = id;
    }

    @Override
    public String getId() {
        return this.guildId;
    }

    public boolean isTrackAnnounce() {
        return trackAnnounce;
    }

    public GuildConfig setTrackAnnounce(boolean trackAnnounce) {
        this.trackAnnounce = trackAnnounce;
        return this;
    }

    public boolean isAutoResume() {
        return autoResume;
    }

    public GuildConfig setAutoResume(boolean autoplay) {
        this.autoResume = autoplay;
        return this;
    }

    public String getLang() {
        return lang;
    }

    public GuildConfig setLang(String lang) {
        this.lang = lang;
        return this;
    }
}
